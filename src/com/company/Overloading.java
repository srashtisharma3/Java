package com.company;

public class Overloading {

    static void foo(){
        System.out.println("Hello, simmy");
    }

    static void foo(int a){
        System.out.println("Hello, there " + a);
    }

    static void foo(int a, int b){
        System.out.println("hello, " + (a + b));
    }

    public static void main(String[] args) {

        foo();
        foo(300);
        foo(1000, 500);
    }
}
