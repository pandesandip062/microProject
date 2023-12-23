package project30sep2;

import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :-->");
        int num = sc.nextInt();
        int temp=0;
       for(int i=2;i<num;i++){
           if(num%i==0){
               temp = temp+1;
           }
       }
       if(temp==0){
           System.out.println(num+" is prime number");
       }else {
           System.out.println(num+" is not prime number");
       }*/

        int num =100;
        int count=0;
        for(int i=1;i<100;i++){//1 2
            for (int j=2;j<i;j++){
                if(i%j==0) {//1/2
                   count=count+1;
                }
            }
           if(count==0){
               System.out.println(i+" is prime number");
           }else{
               count=0;
           }
        }

    }

}
