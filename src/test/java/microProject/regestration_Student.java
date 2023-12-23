package microProject;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class regestration_Student {
    static Connection con;
    static PreparedStatement pt;

    public static void regestration() throws SQLException, ClassNotFoundException {
        try {
            con = DB_Connection.DBCONNECTION();
            Scanner sc = new Scanner(System.in);
            String query = "insert into students (id,username,pass) values(?,?,?)";
            pt = con.prepareStatement(query);
            System.out.println("Enter id>>");
            int id = sc.nextInt();
            System.out.println("enter username>> ");
            String un = sc.next();
            System.out.println("Enter pass>> ");
            String pass = sc.next();
            pt.setInt(1, id);
            pt.setString(2, un);
            pt.setString(3, pass);
            pt.execute();
            System.out.println("Record inserted succesfully");
            pt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("user is already exist,please register with another username/id");
        }

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        regestration();
    }
}
