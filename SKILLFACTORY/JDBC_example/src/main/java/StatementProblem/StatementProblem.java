package StatementProblem;

import java.sql.*;

public class StatementProblem {
    private  static final String URL = "jdbc:postgresql://localhost/testDB?user=postgres&password=Password_030823";
    private static String conOk = "Database connection established.";
    private static String conErr = "Database connection error.";
    private static String login = "admin";
    private static String password = "nevermind' or '1'='1";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(URL);
            System.out.println(String.format("%s", conOk));
            Statement statement = connection.createStatement();
            String query = "select * from users where login='" + login + "' and password ='" + password + "'";
            System.out.println(query);
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println("User id=" + resultSet.getInt("id") + " "
                + "name=" + resultSet.getString("login") + " " +
                        "password=" + resultSet.getString("password"));
            }

            statement.close();
            connection.close();
    } catch (SQLException e) {
            System.out.println(String.format("%s", conErr));
            e.printStackTrace();
        }
    }
}
