package PreparedStatementFixProblem;

import java.sql.*;

public class PrepStatFixProb {
    private  static final String URL = "jdbc:postgresql://localhost/testDB?user=postgres&password=Password_030823";
    private static String conOk = "Database connection established.";
    private static String conErr = "Database connection error.";
    private static String login = "admin";
//    private static String password = "admin";
    private static String password = "nevermind' or '1'='1";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(URL);
            System.out.println(String.format("%s", conOk));

            String query = "select * from users where login=? and password=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println("User id=" + resultSet.getInt("id") + " "
                        + "name=" + resultSet.getString("login") + " " +
                        "password=" + resultSet.getString("password"));
            }

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(String.format("%s", conErr));
            e.printStackTrace();
        }
    }
}
