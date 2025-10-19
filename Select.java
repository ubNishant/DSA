import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

//java -cp ".;mysql-connector-j-8.0.31.jar" SelectRecord
class SqlDemo {
    public static void main(String args[]) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/department", "root", "root");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT;");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
        }
        rs.close();

        con.close();
    }
}
