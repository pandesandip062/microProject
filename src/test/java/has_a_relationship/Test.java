package has_a_relationship;

import java.util.Scanner;

public class Test
{

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int a = sc.nextInt();
       int finalNumber=a;
       int rev= 0;
       while (a!=0){
           int rem = a%10;
           rev= rev*10+rem;
           a=a/10;
       }
        System.out.println("Reverse number is "+rev);
       if(finalNumber==rev){
           System.out.println("given number is palindrome number");
       }else {
           System.out.println("given number is not palindrome number");
       }
    }
}

