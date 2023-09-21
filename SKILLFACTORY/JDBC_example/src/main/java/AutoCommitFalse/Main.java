package AutoCommitFalse;

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
        try {
            connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
            connection.setAutoCommit(false);
            if (connection == null) {
                System.out.println("Not connection with DataBase.");
            } else {
                System.out.println("Connection with DataBase established.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

            String SQL = "alter table users add surname varchar(255)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
                preparedStatement.executeUpdate();
                connection.commit();
                System.out.println("Transaction passed.");
            } catch (SQLException e) {
                connection.rollback();
                System.out.println("Transaction didn't pass.");
                e.printStackTrace();
            }
    }
}
