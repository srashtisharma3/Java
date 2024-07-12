package com.company;

class A {

    public void methodA() {
        System.out.println("This is method A in class A");
    }

}

class B extends A {

    @Override
    public void methodA() {
        System.out.println("This is method A in class B");
    }

    public void methodB() {
        System.out.println("This is method B in class B");
    }

}

public class Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.methodA();

        B b = new B();
        b.methodA(); // This will call the overridden methodA in class B
        b.methodB();
    }
}

