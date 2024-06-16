package com.company;
import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        System.out.println("Enter year to check whether leap year or not ? ");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();

        if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            System.out.printf("%d is a leap year.%n", year);
        } else {
            System.out.printf("%d is not a leap year.%n", year);
        }
    }
}
