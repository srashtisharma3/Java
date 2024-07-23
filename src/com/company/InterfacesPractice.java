package com.company;

interface Bicycle {
    int a = 5; // interface properties is already final, you can not modify it
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface Horn {
    void hornblow();
    void hornblowww();
}

class AvonCycle implements Bicycle, Horn{
    void blowHorn(){
        System.out.println("peepeepeepee");
    }

    public void applyBrake(int decrement) {
        System.out.println("Apply brake!! ");
    }

    public void speedUp(int increment) {
        System.out.println("Speedup!! ");
    }

    public void hornblow() {
        System.out.println("ooooyyyyyeeee");
    }

    public void hornblowww() {
        System.out.println("bbbbyyyyeeee");
    }
}

public class InterfacesPractice {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(1);
        cycle.speedUp(5);
/*
        // you cant create properties in interface
        System.out.println(cycle.a);

        // you cant modify properties in interface
        cycle.a = 45;
        System.out.println(cycle.a);
        */
    }
}
