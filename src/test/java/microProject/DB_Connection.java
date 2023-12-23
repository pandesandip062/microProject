package microProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {

    public static Connection DBCONNECTION() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url ="jdbc:mysql://localhost:3306/microProjevt?characterEncoding=latin1";
        Connection conn = DriverManager.getConnection(url,"root","root1");
        return conn;

    }

}

