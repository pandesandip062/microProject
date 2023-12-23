package microProject;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class LoginPage {

    public static void isContinue() throws SQLException, ClassNotFoundException {
        System.out.println("Do you want to continue: Press Y/y for No N/n  >>");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (input.charAt(0) == 'Y' || input.charAt(0) == 'y') {
            main(null);
            System.out.println("-----------------------------------------------");
        } else if (input.charAt(0) == 'N' || input.charAt(0) == 'n') {
            System.out.println("Thank you");
        } else {
            System.out.println(" Please enter the correct option>>");
            isContinue();
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("1. Register Student");
        System.out.println("2. Enter into the Exam");
        System.out.println("3. Admin access to recover the data");
        System.out.println("4. Get data by id");
        System.out.println("5. Clear the existing record");

        System.out.println("-----------------------------------------------------------------------------");

        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your option>> ");
            int choise = sc.nextInt();

            switch (choise) {
                case 1:
                    regestration_Student.regestration();
                    System.out.println("---------------------------------------------------------------");
                    isContinue();
                    break;
                case 2:
                   Student_LoginPage.Login();
                    System.out.println("-----------------------------------------------------------------");
                    isContinue();
                    break;
                case 3:
                  utility.show_data();
                  System.out.println("-----------------------------------------------------------");
                  isContinue();
                    break;
                case 4:
                    utility.getData_Id();
                    isContinue();
                    break;
                case 5:
                    clearData.clear_data();
                    isContinue();
                    break;
                default:
                    System.out.println("please enter correct option");
                    main(null);

            }

        } catch (InputMismatchException e) {
            System.out.println("please enter valid number");
            main(null);
        }

    }

}