import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count =0;
        for(int i=2;i<a;i++){
            if(a%i==0){
               count=count+1;
            }

        }
        if(count==1)
            System.out.println("num is prime");
        }
/*
        switch(a){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namste");
                break;
            case 3:
                System.out.println("Welcome");
                break;
            default:
                System.out.println("invalid option selected");*//*
        }*/

        /*for(int i=0;i<=10;i++){
            if(i==7){
                break;
            }
            System.out.println("Sandip "+i);
        }*/
    }
