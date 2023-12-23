package microProject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class clearData extends Student_LoginPage{
    static String user;
    static String username1;
    static String username;

    public static void getuser() throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        con = DB_Connection.DBCONNECTION();
        String query = "select * from students where username=?";
        pt = con.prepareStatement(query);
        System.out.println("Enter username");
        username1 = sc.next();
        pt.setString(1,username1);
        ResultSet rs = pt.executeQuery();
        while (rs.next()) {
            user = rs.getString(2);
        }
    }
    public static void clear_data() throws SQLException, ClassNotFoundException {
        getuser();
        Scanner sc = new Scanner(System.in);
        if (username1.equals(user)) {
            String query1 = "update  students set marks =0 ,Grade= null where username=?";
            pt = con.prepareStatement(query1);
            pt.setString(1, user);
            pt.executeUpdate();
            System.out.println("record cleared");

        }else {
            System.out.println("Enter correct username");
            clear_data();
        }
    }

}
