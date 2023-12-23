package mySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class test4 {

    static Connection conn =null;
    static PreparedStatement pt =null;

    public static void createRecord(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter how many records wnated to create> ");
            int num = sc.nextInt();
            for(int i=1;i<=num;i++) {
                conn = baseClass.getconn();
                String query = "insert into student values(?,?,?,?)";
                pt = conn.prepareStatement(query);

                System.out.println("Enter id> ");
                int id = sc.nextInt();
                System.out.println("Enter name> ");
                String name = sc.next();
                System.out.println("Enter city> ");
                String city = sc.next();
                System.out.println("Enter marks> ");
                int marks = sc.nextInt();


                pt.setInt(1, id);
                pt.setString(2, name);
                pt.setString(3, city);
                pt.setInt(4, marks);
                pt.executeUpdate();
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                conn.close();
                pt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) {
        createRecord();
    }
}
