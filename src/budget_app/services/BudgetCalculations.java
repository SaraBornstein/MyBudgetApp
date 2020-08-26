package budget_app.services;

import java.sql.*;

public class BudgetCalculations {

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public boolean run(){
        try{
            //creating database connection
            initializeConnection();



            //closing connections
            closeConnections();

            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private void initializeConnection() throws Exception {
        // This will load the MySQL driver, each DB has its own driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded.");
        } catch (ClassNotFoundException e) {
            throw new Exception("Could not load driver");
        }

        // Setup the connection with the DB
        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost/BudgetingAppDB?"
                            + "user=root&password=4F06ZBYiqXlj&useSSL=false");
            System.out.println("Connected to DB.");
        } catch (SQLException e) {
            throw new Exception("Could not create connection");
        }
        try {
            statement = connection.createStatement();
            System.out.println("Statement created.");
        } catch (SQLException e) {
            throw new Exception("Could not create statement");
        }
    }

    private void closeConnections() throws SQLException {
        // close all JDBC elements
        statement.close();
        //resultSet.close();
        connection.close();
        System.out.println("Connections closed");
    }

}
