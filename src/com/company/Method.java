package com.company;
/* with static
public class Method {
    static int logic(int x, int y){
        int z;
        if(x > y){
            z = x + y ;
        }else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = logic(a, b);
        System.out.println(c);

        int r = logic(2, 3);
        System.out.println(r);
    }
}*/

// without static
public class Method {
    int logic(int x, int y){
        int z;
        if(x > y){
            z = x + y ;
        }else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c;
        Method obj = new Method();
        c = obj.logic(a, b);
        System.out.println(c);

    }
}
