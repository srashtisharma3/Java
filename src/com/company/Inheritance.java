package com.company;

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printHere(){
        System.out.println("I am a constructor!!");
    }
}

class Derived extends Base {
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {

        // creating obj from base class
        Base b = new Base();
        b.setX(12345);
        System.out.println(b.getX());

        // creating obj from derived class
        Derived d = new Derived();
        d.setX(99999);
        System.out.println(d.getX());
        d.setY(100);
        System.out.println(d.getY());
    }
}
