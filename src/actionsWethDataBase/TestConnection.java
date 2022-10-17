package actionsWethDataBase;

import java.sql.*;

public class TestConnection {
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "1922";
    public static final String URL = "jdbc:mysql://localhost:3306/mysql";
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static Connection createConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            System.out.println("DRIVER connect");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("DRIVER Invalid");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQL Error");
        }
        return connection;
    }

    public static void makeTable(String request, Connection connection) throws SQLException {

        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.execute(request);
            System.out.println("Table created");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void deleteTable(String request, Connection connection){
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.execute(request);
            System.out.println("Table deleted");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void enterToDataBase(String request, Connection connection) throws SQLException {
        connection.createStatement().executeUpdate(request);
    }

    public static ResultSet getStreamInformation(String request, Connection connection) throws SQLException {
        return connection.createStatement().executeQuery(request);
    }
}


