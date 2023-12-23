package mySQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class test1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

     Class.forName("com.mysql.jdbc.Driver");
     String url ="jdbc:mysql://localhost:3306/test30sep?characterEncoding=latin1";
     Connection conn = DriverManager.getConnection(url,"root","root1");
     Statement st = conn.createStatement();
     String query ="insert into student value(102,'Ankush','Yawatmal',80)";
     int i = st.executeUpdate(query);
    }


}
