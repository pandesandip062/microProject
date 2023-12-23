package SqlProject;

import java.sql.SQLException;
import java.util.Scanner;

public class Project_Live {

    public static void isContiune() throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input for continue enter Y for No enter N");
        String input = sc.next();
        if(input.charAt(0)=='Y'||input.charAt(0)=='y'){
            main(null);
        } else if (input.charAt(0)=='N'||input.charAt(0)=='n') {
            System.out.println("Thank you");

        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("-----------------------------------------------------------");
        System.out.println("1. Insert Record");
        System.out.println("2. Update Record");
        System.out.println("3. Delete Record");
        System.out.println("4. Retrive Record");
        System.out.println("5. join Record");
        System.out.println("----------------------------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input");
        int Choise = sc.nextInt();
        switch (Choise){
            case 1:utiltiy.insertRecord();
            break;
            case 2:utiltiy.RetriveRecord();
            break;
        }


    }
}
