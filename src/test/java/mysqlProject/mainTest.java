package mysqlProject;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mainTest {

    public static void isContinue() throws SQLException, ClassNotFoundException {
        System.out.println("Do you want to continue: Press Y/y for No N/n  >>");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if(input.charAt(0)=='Y'|| input.charAt(0)=='y'){
            main(null);
            System.out.println("-----------------------------------------------");
        }else if(input.charAt(0)=='N'|| input.charAt(0)=='n'){
            System.out.println("Thank you");
        }else {
            System.out.println(" Please enter the correct option>>");
            isContinue();
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        System.out.println("********************************* MENU ****************************************");
        System.out.println("1. Insert");
        System.out.println("2. Update");
        System.out.println("3. Retrive");
        System.out.println("4. Delete");
        System.out.println("5. Join Table");
        System.out.println("********************************************************************************");

        try {

            Scanner sc = new Scanner(System.in);
            int choise = sc.nextInt();

            switch (choise) {
                case 1:
                    baseClass.insertRecord();
                    System.out.println("---------------------------------------------------------------");
                    isContinue();
                    break;
                case 2:
                    baseClass.insertRecord();
                    System.out.println("-----------------------------------------------------------------");
                    isContinue();
                    break;
                case 3:
                    baseClass.getRecords();
                    System.out.println("-----------------------------------------------------------");
                    isContinue();
                    break;
                case 4:
                    baseClass.deleteRecord();
                    isContinue();
                    break;
                case 5:
                    baseClass.joinTable();
                    isContinue();
                    break;
                default:
                    System.out.println("please enter correct option");

            }

        }catch (InputMismatchException e){
            System.out.println("please enter valid number");
        }

    }
}
