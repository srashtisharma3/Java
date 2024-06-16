package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter english marks");
        int en = scanner.nextInt();
        System.out.println("Enter hindi marks");
        int hn = scanner.nextInt();
        System.out.println("Enter science marks");
        int sci = scanner.nextInt();
        System.out.println("Enter math marks");
        int m = scanner.nextInt();
        System.out.println("Enter cs marks");
        int cs = scanner.nextInt();
        System.out.println("Enter out of total marks");
        float total = scanner.nextFloat();
        float per = ((en + hn + sci + m + cs)/total)*100;
        System.out.print("Percentage = ");
        System.out.println(per);
    }
}
