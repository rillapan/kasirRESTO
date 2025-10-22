package cafe.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Utility class for managing PostgreSQL database connections.
 */
public class DatabaseConnection {

    private static final String URL = "jdbc:postgresql://localhost:5433/kasirnrpm";
    private static final String USER = "postgres";
    private static final String PASSWORD = "1234";

    /**
     * Establishes and returns a connection to the PostgreSQL database.
     *
     * @return Connection object
     * @throws SQLException if a database access error occurs
     */
    public static Connection getConnection() throws SQLException {
        try {
            // Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("PostgreSQL JDBC Driver not found.", e);
        }
    }

    /**
     * Closes the database connection.
     *
     * @param connection the Connection to close
     */
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println("Error closing connection: " + e.getMessage());
            }
        }
    }

    /**
     * Main method to test the database connection.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = getConnection();
            if (connection != null) {
                System.out.println("Connection to PostgreSQL database successful!");
            }
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        } finally {
            closeConnection(connection);
        } 
    }
}
