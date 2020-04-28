package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest" +
            "?verifyServerCertificate=false" +
            "&useSSL=false" +
            "&requireSSL=false" +
            "&useLegacyDatetimeCode=false" +
            "&amp" +
            "&serverTimezone=UTC";
    private static final String NAME = "root";
    private static final String PAS = "root";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection connection = DriverManager.getConnection(URL, NAME, PAS);
            if (!connection.isClosed()) {
                System.out.println("The connection is established");
            }
            connection.close();

            if (connection.isClosed()) {
                System.out.println("The connection is closed");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
