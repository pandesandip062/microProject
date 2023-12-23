package insufficentBalenceExceptionj;

import java.util.Scanner;

public class user_Account {

    int balance =50000;

    public  void withdrwal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount which you want to withdrwal: ");
        int withdrwalAmount = sc.nextInt();
        if(withdrwalAmount>balance){
           throw new insufficentBalenceException("Insufficent account balance");
        }else {
            int remainingBalnec =balance-withdrwalAmount;
            System.out.println(remainingBalnec);
        }

    }

    public static void main(String[] args) {
        user_Account a = new user_Account();
        a.withdrwal();
    }

}
