package project30sep2;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%2==0){
            System.out.println("this is a leap year");
        }else {
            System.out.println("This is not leap year");
        }
    }
}
