package mySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class test3 {
    static Connection conn=null;
    static PreparedStatement pst=null;
    public static void insertRow() throws SQLException {

        try{
            conn =baseClass.getconn();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id> ");
            int id = sc.nextInt();
            System.out.println("Enter name> ");
            String name = sc.next();
            System.out.println("Enter city> ");
            String city = sc.next();
            System.out.println("Enter marks> ");
            int marks = sc.nextInt();

            String query = "insert into student values(?,?,?,?)";
            pst =conn.prepareStatement(query);
            pst.setInt(1,id);
            pst.setString(2,name);
            pst.setString(3,city);
            pst.setInt(4,marks);
            pst.executeUpdate();
            System.out.println("record is added succesfully");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);

        }finally {
            conn.close();
            pst.close();
        }
    }

    public static void updateRecord() throws SQLException, ClassNotFoundException {
        conn= baseClass.getconn();
        Scanner sc = new Scanner(System.in);

        String query ="update student set name='Rahul' where id=?";
        System.out.println("Enter id> ");
        int id =sc.nextInt();
        pst = conn.prepareStatement(query);
        pst.setInt(1,id);
        pst.executeUpdate();
        System.out.println("record updated succesfully");
        conn.close();
        pst.close();

    }

    public static void viewRecord() throws SQLException, ClassNotFoundException {
        conn = baseClass.getconn();
        String query = "select * from student";
        pst = conn.prepareStatement(query);
        ResultSet rs =pst.executeQuery();
        System.out.println("Id\t Name\t city\t marks\t");
        while (rs.next()){
            System.out.print(rs.getInt(1));
            System.out.print("\t"+rs.getString(2));
            System.out.print("\t"+rs.getString(3));
            System.out.print("\t"+rs.getInt(4));
            System.out.println();
        }


    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        viewRecord();
    }
}
