package com.company;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter day number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thrusday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("wrong day entered");
        }
    }
}
