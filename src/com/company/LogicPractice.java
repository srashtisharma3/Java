package com.company;

public class LogicPractice {

//    Problem 1: Recursion multiplication--------------------------------------
//    static int factorial(int n){
//        if( n==0 || n==1 ){
//            return 1;
//        }else {
//            return n * factorial(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
////        int x = 5;
//        System.out.println(factorial(7));
//    }


//    Problem 2:  Multiplication ------------------------------------

//    static void multiplication(int n){
//        int i =1;
//        while (i <= 10){
//            int mul = n * i;
//            System.out.println((n + " x " + i) + " = " + mul);
//            i++;
//        }
//    }
//
//    public static void main(String[] args) {
//        multiplication(8);
//    }


//    Problem 3: * pattern ----------------------------
//             *
//             *  *
//             *  *  *
//             *  *  *  *
//             *  *  *  *  *
//             *  *  *  *  *  *

//    static void Tringle(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print(" * ");
//            }
//            System.out.print("\n");
//        }
//    }
//
//    public static void main(String[] args) {
//        Tringle(7);
//    }
//

//         *  *  *  *
//         *  *  *
//         *  *
//         *
//    static void Tringle(int n){
//        for (int i = n; i > 0; i--) {
//            for (int j = i; j > 0; j--) {
//                System.out.print(" * ");
//            }
//            System.out.print("\n");
//        }
//    }
//
//    public static void main(String[] args) {
//        Tringle(4);
//    }


//                 *
//                **
//               ***
//              ****

//    static void Tringle(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = n-i; j > 0; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        Tringle(7);
//    }


//    Problem 4: Recursion sum--------------------------------------

//    static int sum(int n){
////        int sum = 0;
////        for (int i = 0; i <= n; i++) {
////            sum += (n-i);
////        }
////        return sum;
//
//        if (n == 1) {
//            return 1;
//        }
//        return n + sum(n-1);
//    }
//
//    public static void main(String[] args) {
//        int x = 10;
//        System.out.println(sum(x));
//    }


//    Problem 5: Fibonacci series

    static int Fibonacci(int n){
        if (n == 1){
            return 0;
        } else if (n == 2) {
           return 1;
        }else {
            return (n-1) + (n-2);
        }
    }

    public static void main(String[] args) {
        int fib = Fibonacci(5);
        System.out.println(fib);
    }


}
