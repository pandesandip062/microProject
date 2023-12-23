package project30sep2;

import java.util.Scanner;

public class factorsogGivenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       for(int i=1;i<=a;i++){
           if(a%i==0){
               System.out.println("factors of "+a+" is "+i);
           }

       }
}
}
