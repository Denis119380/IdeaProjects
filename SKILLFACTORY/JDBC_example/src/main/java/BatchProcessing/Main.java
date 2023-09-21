package BatchProcessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    private final static String HOST = "localhost";
    private final static String DATABASENAME = "testDB";
    private final static String USERNAME = "postgres";
    private final static String PASSWORD = "Password_030823";
    static Connection connection;

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://" + HOST + "/" + DATABASENAME +
                "?user = " + USERNAME + "&password = " + PASSWORD;
        connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
        try {
            connection.setAutoCommit(false);
            if (connection == null) {
                System.out.println("Not connection with DataBase.");
            } else {
                System.out.println("Connection with DataBase established.");
            }
            String SQL = "Insert into users(login, password, name, surname) values (?, ?, ?, ?);";
            try (PreparedStatement preparedStatement = connection.prepareStatement(SQL)){
                preparedStatement.setString(1, "user");
                preparedStatement.setString(2, "pass");
                preparedStatement.setString(3, "Vlad");
                preparedStatement.setString(4, "Ryzhakov");
                preparedStatement.addBatch();

                preparedStatement.setString(1, "visitor");
                preparedStatement.setString(2, "hello");
                preparedStatement.setString(3, "Bill");
                preparedStatement.setString(4, "Gates");
                preparedStatement.addBatch();

                int[] count = preparedStatement.executeBatch();
                connection.commit();
                System.out.println("Data passed");
            }
        } catch (SQLException e) {
            connection.rollback();
            System.err.println("Data not passed");
            e.printStackTrace();
        }
    }
}
