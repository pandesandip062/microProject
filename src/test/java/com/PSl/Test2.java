package com.PSl;

import java.util.Scanner;

public class Test2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter emp no");
        int empno = sc.nextInt();

        System.out.println("Enter emp salary");
        int empsal = sc.nextInt();

        System.out.println("Enter emp name");
        String empName = sc.next();

        System.out.println("Enter emp city");
        String empCity = sc.next();

        System.out.println("emp state");
        String empState = sc.next();

        Test2 t2 = new Test2();
        System.out.println(t2.test1(empno, empsal, empName));


    }

    private Test1 test1(int empno, int empsal, String empName) {
        Test1 t = new Test1(empno, empsal, empName);
        return t;

    }
}
