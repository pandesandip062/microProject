package microProject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static microProject.LoginPage.main;

public class Student_LoginPage {
   static Connection con;
   static PreparedStatement pt;
   static  String user;
   static  String grade;
   static int marks1;


   public static void grade() throws SQLException, ClassNotFoundException {

       String query = "select * from students where username=?";
       pt = con.prepareStatement(query);
       pt.setString(1,user);
       ResultSet set = pt.executeQuery();

       while (set.next()){
           marks1= set.getInt(4);
       }
       
       if(marks1>=8){
           con = DB_Connection.DBCONNECTION();
           String query1 = "update  students set Grade='A' where username=?";
           pt = con.prepareStatement(query1);
           pt.setString(1,user);
           pt.executeUpdate();
       } else if (marks1>=5) {
           con = DB_Connection.DBCONNECTION();
           String query1 = "update  students set Grade='B' where username=?";
           pt = con.prepareStatement(query1);
           pt.setString(1,user);
           pt.executeUpdate();

       }else if (marks1>=3){
           con = DB_Connection.DBCONNECTION();
           String query1 = "update  students set Grade='C' where username=?";
           pt = con.prepareStatement(query1);
           pt.setString(1,user);
           pt.executeUpdate();
       } else if (marks1>=2) {
           con = DB_Connection.DBCONNECTION();
           String query1 = "update  students set Grade='D' where username=?";
           pt = con.prepareStatement(query1);
           pt.setString(1,user);
           pt.executeUpdate();

       }

   }

   public static void marks() throws SQLException, ClassNotFoundException {
       con = DB_Connection.DBCONNECTION();
       String query1 = "update  students set marks =marks+1 where username=?";
       pt = con.prepareStatement(query1);
       pt.setString(1,user);
       pt.executeUpdate();

   }

    public static void Login() throws SQLException, ClassNotFoundException {
        con = DB_Connection.DBCONNECTION();
        Scanner sc = new Scanner(System.in);
        String query = "select * from students where username=? and pass=?";
        pt = con.prepareStatement(query);
        System.out.println("Enter userName>> ");
        user = sc.next();
        pt.setString(1,user);
        System.out.println("Enter Pass>> ");
        String pass = sc.next();
        pt.setString(2,pass);
        ResultSet set = pt.executeQuery();

        String un=null;
        String passward=null;
        while (set.next()) {
            un= set.getString("username");
            passward= set.getString(3);
            grade = set.getString(5);

        }
        if (user.equals(un)&&passward.equals(pass)){
           Question_Paper.question_1();
           Question_Paper.question_2();
           Question_Paper.question_3();
           Question_Paper.question_4();
           Question_Paper.question_5();
           Question_Paper.question_6();
           Question_Paper.question_7();
           Question_Paper.question_8();
           Question_Paper.question_9();
           Question_Paper.question_10();
           marks();
           grade();
           System.out.println("thank you for attempting exam");
        }else {
            System.out.println("Enter correct username & Password");
            main(null);
        }

    }

}

