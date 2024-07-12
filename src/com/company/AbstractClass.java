package com.company;

abstract class Parent {
    Parent(){
        System.out.println("I am constructor of parent class!");
    }

    abstract public void greet();
    abstract public void greet2();
}

class Child extends Parent {
    @Override
    public void greet() {
        System.out.println("Hello, this is child class!!");
    }

    @Override
    public void greet2() {
        System.out.println("Good morning!!");
    }
}

abstract class Child2 extends Parent {
    public void hey(){
        System.out.println("Hello, this is second child class!!");
    }
}

class ConcreteChild2 extends Child2 {
    @Override
    public void greet() {
        System.out.println("Greetings from ConcreteChild2!");
    }

    @Override
    public void greet2() {
        System.out.println("Good evening from ConcreteChild2!");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.greet();
        c1.greet2();

        ConcreteChild2 c2 = new ConcreteChild2();
        c2.hey();
        c2.greet();
        c2.greet2();

        /*
        Parent p = new Parent(); // We cant assign the objects to the parent class
        */
    }
}
