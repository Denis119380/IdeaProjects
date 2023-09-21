package PreparedStatementInterface;

import java.sql.*;

public class PreparedStatementDemo {
    private static final String URL = "jdbc:postgresql://localhost/testDB?user=postgres&password=Password_030823";
    private static String conOk = "Database connection established.";
    private static String conErr = "Database connection error.";

    public static void main(String[] args) {

        int count = 2;
        try {
            Connection connection = DriverManager.getConnection(URL);
            System.out.println(String.format("%s", conOk));

            String SQL = "select * from table1 where id = ?;";
            // знак ? называется маркером, и способен получать значение
                PreparedStatement preparedStatement = connection.prepareStatement(SQL);
                preparedStatement.setInt(1, count); // '1' - столбец (id), 'count' - значение столбца (id)
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    System.out.print(resultSet.getString("name") + "--");
                    System.out.print(resultSet.getLong("phone"));
                }
                resultSet.close();
                preparedStatement.close();
                connection.close();
        } catch (SQLException e) {
            System.out.println(String.format("%s", conErr));
            e.printStackTrace();
        }
    }
}
