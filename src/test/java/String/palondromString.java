package String;

import java.util.Scanner;

public class palondromString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String rev ="";
        for(int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);
        }
        if(a.equals(rev)){
            System.out.println("given String is palindrome");
        }else {
            System.out.println("Given String is not palindrome");
        }

    }

}
