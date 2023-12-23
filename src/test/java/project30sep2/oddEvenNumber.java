package project30sep2;

import java.util.Scanner;

public class oddEvenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println(a +" is even number");
        }else {
            System.out.println(a+" is not even number");
        }
    }
}
