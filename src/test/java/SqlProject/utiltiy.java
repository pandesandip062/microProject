package SqlProject;

import java.sql.*;
import java.util.Scanner;

public class utiltiy {
    static Connection con;
   static PreparedStatement pt;
    public static void insertRecord() throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        con =DB_connection.get_connection();
        String Query = "insert into psl values(?,?,?,?)";
         pt = con.prepareStatement(Query);
        System.out.println("Enetr Id >");
        int id = sc.nextInt();
        System.out.println("Emter Name >");
        String name = sc.next();
        System.out.println("Enter City >");
        String city = sc.next();
        System.out.println("Enter Salary >");
        int Salary = sc.nextInt();

        pt.setInt(1,id);
        pt.setString(2,name);
        pt.setString(3,city);
        pt.setInt(4,Salary);
        pt.execute();
        System.out.println(" Record inserted succesfully");


    }
    public static void RetriveRecord() throws SQLException {
     String query ="select*from psl";

        System.out.print("Id/t   Name/t     City/t      Salary/td");
        pt = con.prepareStatement(query);
       ResultSet rs = pt.getResultSet();
        System.out.println("/t ");
        pt.executeUpdate();
    }
}
