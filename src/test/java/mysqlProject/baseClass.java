package mysqlProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class baseClass {

    static Connection con;
    static PreparedStatement pt;
    static Scanner sc;
    public static void insertRecord() throws SQLException, ClassNotFoundException {
         con = DBconnection.getconection();
        String query =" insert into student values (?, ?, ?, ?)";
        pt = con.prepareStatement(query);
        sc = new Scanner(System.in);
        System.out.println("Enter id > ");
        int id = sc.nextInt();
        System.out.println("Enter name > ");
        String name = sc.next();
        System.out.println("Enter city > ");
        String city =  sc.next();
        System.out.println("Enter Marks > ");
        int marks  = sc.nextInt();

        pt.setInt(1,id);
        pt.setString(2,name);
        pt.setString(3,city);
        pt.setInt(4,marks);

        pt.executeUpdate();
        System.out.println("insert record succesfully");



    }

    public static void updateRecord() throws SQLException, ClassNotFoundException {
        con= DBconnection.getconection();
        Scanner sc = new Scanner(System.in);

        String query ="update student set name='Ram' where id=?";
        pt = con.prepareStatement(query);
        System.out.println("Enter id> ");
        int id = sc.nextInt();
        pt.setInt(1,id);
        pt.execute();
        System.out.println("Record updated succesfully");
        pt.close();
        con.close();


    }

    public static void getRecords() throws SQLException, ClassNotFoundException {
        con = DBconnection.getconection();
        String query ="select * from student";
        pt = con.prepareStatement(query);
        ResultSet set = pt.executeQuery();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("id    |\t   Name    |\t  City    |\t  Marks");
        System.out.println("---------------------------------------------------------------------------");
        while (set.next()){
            System.out.print("\t"+ set.getInt(1));
            System.out.print("\t"+ set.getString(2));
            System.out.print("\t"+set.getString(3));
            System.out.print("\t"+set.getInt(4));

            System.out.println();

        }
        con.close();
        pt.close();
    }
    public static void deleteRecord() throws SQLException, ClassNotFoundException {
        Scanner sc  = new Scanner(System.in);
        con =DBconnection.getconection();
        String query ="delete from student where id=?";
        pt = con.prepareStatement(query);
        System.out.println("Enter Id > ");
        int id = sc.nextInt();
        pt.setInt(1,id);
        pt.execute();
        System.out.println(" deleted record from table");
        con.close();
        pt.close();


    }

    public static void joinTable() throws SQLException, ClassNotFoundException {
        con = DBconnection.getconection();
        String query ="select student.name, student.marks,result.staus  from student inner join result on student.id = result.id";
        pt = con.prepareStatement(query);
        System.out.println("-------------------------------------------");
        System.out.println("name |\t marks  |\t staus");
        System.out.println("---------------------------------------------");
        ResultSet rs = pt.executeQuery();
        while (rs.next()){
            System.out.print(rs.getString(1));
            System.out.print("\t   "+ rs.getInt(2));
            System.out.print("\t      "+rs.getString(3));
            System.out.println();
        }
        con.close();
        pt.close();
    }
}
