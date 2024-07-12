package com.company;

class SuperClass{

    public SuperClass(){
        System.out.println("I am superclass constructor");
    }

    public SuperClass(int x){
        System.out.println("I am superclass constructor and x : " + x );
    }

}

class SubClass extends SuperClass{

    public SubClass(){
        System.out.println("I am subclass constructor");
    }
    public SubClass(int x, int y){
        super(x);
        System.out.println("I am subclass constructor and y : " + y);
    }

}

class SubChild extends SubClass{

    public SubChild(){
        System.out.println("I am SubChild constructor");
    }
    public SubChild(int x, int y, int z){
        super(x, y);
        System.out.println("I am SubChild constructor and z : " + z);
    }
}


public class ConstructorInheritance {
    public static void main(String[] args) {
//        SubClass res = new SubClass();
//        SubClass res = new SubClass(10, 20);
//        SubChild res = new SubChild();
        SubChild res = new SubChild(10,20,30);
    }
}
