package mysqlProject;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

    public static Connection getconection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url ="jdbc:mysql://localhost:3306/test30sep?characterEncoding=latin1";
        Connection conn = DriverManager.getConnection(url,"root","root1");
        return conn;

    }
}
