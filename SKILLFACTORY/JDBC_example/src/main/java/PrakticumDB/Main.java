package PrakticumDB;

import java.sql.*;
import java.util.Scanner;

public class Main {
    private final static String HOST = "localhost";
    private final static String DATABASENAME = "testDB";
    private final static String USERNAME = "postgres";
    private final static String PASSWORD = "Password_030823";
    static Connection connection;

    public static void main(String[] args) {
        String url = "jdbc:postgresql://" + HOST + "/" + DATABASENAME +
                "?user = " + USERNAME + "&password = " + PASSWORD;
        try {
            connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
            if (connection == null)
                System.out.println("Not connected DB.");
            else {
                System.out.println("Connected DB correct.");
                if (checkValue(new Scanner(System.in).nextInt())) {
                    System.out.println("The number is in the table.");
                } else {
                    System.out.println("The number is not in the table.");
                }
                if (insertValue(new Scanner(System.in).nextInt())) {
                    System.out.println("The age inserted to table.");
                } else {
                    System.out.println("The age didn't insert to table.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean checkValue(int checkValue) {
        String SQL = "select * from users where id = ?;";
        try (PreparedStatement statement = connection.prepareStatement(SQL)) {
            statement.setInt(1, checkValue);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
        return false;
    }

    public static boolean insertValue(int insertValues) {
        String SQL = "insert into users(age) values (?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
            preparedStatement.setInt(1, insertValues);
            int i = preparedStatement.executeUpdate();
            if (i >= 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
