package microProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class utility {
   static Connection con;
    static PreparedStatement pt;
    static int id1;
    static int id;


    public static void show_data() throws SQLException, ClassNotFoundException {
      Scanner sc = new Scanner(System.in);
      con = DB_Connection.DBCONNECTION();
      String query1="select * from admin";
      pt=con.prepareStatement(query1);
      ResultSet rs1 =pt.executeQuery();
      String un =null;
      String pw = null;
      while (rs1.next()){
           un = rs1.getString(1);
           pw = rs1.getString(2);
      }
        System.out.println("Enter Admin userName>> ");
        String user = sc.next();
        System.out.println("Enter Admin Password>> ");
        String password = sc.next();

      if(user.equals(un)&&password.equals(pw)){

        System.out.println("--------------------------------------");
        System.out.println("id| UserName|Pass |Marks |Grade");
        System.out.println("----------------------------------------");
        con=DB_Connection.DBCONNECTION();
        String queru = "select * from students order by marks desc";
        pt = con.prepareStatement(queru);
        ResultSet rs = pt.executeQuery();

        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String pass = rs.getString(3);
            int marks = rs.getInt(4);
            String Grade = rs.getString(5);
            System.out.print(id);
            System.out.print("\t" + name);
            System.out.print("\t" + pass);
            System.out.print("\t" + marks);
            System.out.print("\t" + Grade);
            System.out.println();
        }

        }else {
          System.out.println("Enter correct credentials of Admin");
          show_data();
      }
    }

    public static void getData_Id() throws SQLException, ClassNotFoundException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student id>> ");
        if (sc.hasNextInt()) {
            id1 = sc.nextInt();
            if(id1>=101 && id1<=105) {
                con = DB_Connection.DBCONNECTION();
                String query = "select * from students where id=?";
                pt = con.prepareStatement(query);
                pt.setInt(1, id1);
                ResultSet rs = pt.executeQuery();
                while (rs.next()) {
                    id = rs.getInt(1);
                }
                System.out.println(id);
                System.out.println(id1);
                getDatabyId();
            }else {
                System.out.println("Enter correct input");
                getData_Id();
            }
        }else {
            System.out.println("Entered wrong format input, please enter correct input");
            getData_Id();
        }

    }
    public static void getDatabyId() throws SQLException, ClassNotFoundException {
        if (id1 == id) {
            con = DB_Connection.DBCONNECTION();
            String queru = "select * from students where id=?";
            Scanner sc = new Scanner(System.in);
            pt = con.prepareStatement(queru);
            pt.setInt(1, id1);
            ResultSet rs = pt.executeQuery();
            System.out.println("--------------------------------------");
            System.out.println("id| UserName|Pass |Marks |Grade");
            System.out.println("----------------------------------------");

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String pass = rs.getString(3);
                int marks = rs.getInt(4);
                String Grade = rs.getString(5);
                System.out.print(id);
                System.out.print("\t" + name);
                System.out.print("\t" + pass);
                System.out.print("\t" + marks);
                System.out.print("\t" + Grade);
                System.out.println();

            }
        }else {
            System.out.println("Enter valid id");
            getDatabyId();
        }
    }
}
