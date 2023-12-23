package mySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class test2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/test30sep?characterEncoding=latin1";
        Connection con = DriverManager.getConnection(url,"root","root1");
        System.out.println("enter id ");
        int id =sc.nextInt();
        System.out.println("Enter name ");
        String name = sc.next();
        System.out.println("Enter city ");
        String city = sc.next();
        System.out.println("Enter marks ");
        int marks = sc.nextInt();

        String query ="insert into student values(?, ?, ?, ?)";

        PreparedStatement pt =con.prepareStatement(query);

        pt.setInt(1,id);
        pt.setString(2,name);
        pt.setString(3,city);
        pt.setInt(4,marks);

        int i = pt.executeUpdate();
        System.out.println(i+ "row upadted");
        con.close();
        pt.close();





    }
}
