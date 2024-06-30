import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {

   

     static Connection conn = null;

     public static Connection connect() throws SQLException {
         if (conn == null || conn.isClosed()) {
             try {
                 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "Ganesh@123");
                 System.out.println("Connection successfully established");
             } catch (SQLException e) {
                 System.err.println("Connection failed: " + e.getMessage());
                
             }
         }
         return conn;
     }
}