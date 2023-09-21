import java.sql.*;

public class JDBCDemo {
    private  static final String URL = "jdbc:postgresql://localhost/testDB?user=postgres&password=Password_030823";
    private static String conOk = "Database connection established.";
    private static String conErr = "Database connection error.";

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(URL);
            System.out.println(String.format("%s", conOk));
            Statement statement = connection.createStatement();
            String sql = "select id from newtest";

            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println("id");
            System.out.println("||----------||");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
            }
            System.out.println("||----------||");

            statement.close();
            resultSet.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(String.format("%s", conErr));
            e.printStackTrace();
        }

    }
}
