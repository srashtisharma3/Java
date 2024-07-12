package com.company;

public class Reference {
    static void change(int x){
        x = 50;
    }
    static void change2(int [] arr ){
        arr[0] = 82;
    }

    public static void main(String[] args) {
        int a = 30;
        change(a);
        System.out.println(a);


        int [] num = {54,78,65,48,73,49};
        change2(num);
        System.out.println(num[0]);
    }


}
