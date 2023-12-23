package mySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class baseClass {

    public  static Connection getconn() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test30sep?characterEncoding=latin1";
        Connection con = DriverManager.getConnection(url,"root","root1");
        return con;


    }
}
