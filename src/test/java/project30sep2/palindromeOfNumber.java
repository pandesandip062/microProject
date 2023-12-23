package project30sep2;

import java.util.Scanner;

public class palindromeOfNumber  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev=0;
        int finalNum = num;
        while (num!=0){
            int rem =num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
        if(rev==finalNum){
            System.out.println("given number is palindrome");
        }else {
            System.out.println("Given number is not palindrome");
        }
    }

}
