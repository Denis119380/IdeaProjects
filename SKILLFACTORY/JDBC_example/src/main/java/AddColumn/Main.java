package AddColumn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    private final static String HOST = "localhost";
    private final static String DATABASENAME = "testDB";
    private final static String USERNAME = "postgres";
    private final static String PASSWORD = "Password_030823";

    public static void main(String[] args) {
        String url = "jdbc:postgresql://" + HOST + "/" + DATABASENAME +
                "?user = " + USERNAME + "&password = " + PASSWORD;
        try (Connection connection = DriverManager.getConnection(url, USERNAME, PASSWORD);) {
            if (connection == null)
                System.out.println("Not connected DB.");
            else {
                System.out.println("Connected DB correct.");
                String SQL = "alter table users add age integer;";
                try (PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
                    preparedStatement.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
