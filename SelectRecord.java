// Step 1. Import Required Packages
import java.sql.*;

//java -cp ".;mysql-connector-j-8.0.31.jar" SelectRecord

public class SelectRecord {
    public static void main(String[] args) {
        // Using try-with-resources for auto-closing resources
        try {
            // Step 2s. Load and Register MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 3. Create and Establish the Connection to MySQL
            String url = "jdbc:mysql://localhost/departement";
            String username = "root";
            String password = "root";

            try (Connection conn = DriverManager.getConnection(url, username, password);
                 Statement stmt = conn.createStatement()) {

                // Step 4. Create and Execute SQL Command
                String selectTable = "SELECT * FROM STUDENT_INFO;";
                try (ResultSet rs = stmt.executeQuery(selectTable)) {
                    // Step 5. Process the Results
                    if (rs.next()) {
                        System.out.println("ID\tFIRST_NAME\tLAST_NAME");
                        do {
                            int id = rs.getInt(1);
                            String first_name = rs.getString(2);
                            String last_name = rs.getString(3);
                            System.out.println(id + "\t" + first_name + "\t" + last_name);
                        } while (rs.next());
                    } else {
                        System.out.println("Record Not Found...");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
