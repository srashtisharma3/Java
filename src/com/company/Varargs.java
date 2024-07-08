package com.company;

public class Varargs {

//    static int sum(int ...arr){ // parameters
//        int res = 0;
//        for (int a:arr){
//        res += a;
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(sum(1,5));
//        System.out.println(sum(1,5,5,9));
//        System.out.println(sum(1,5,4,8,71,32));  // arguments
//    }


    static int sum(int x, int y, int ...arr){
        int res = x + y;
        for (int a:arr){
            res += a;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,5));
        System.out.println(sum(2,5,5,9));
        System.out.println(sum(3,5,4,8,71,32));
    }
}
