package com.company;

class Phone {

    public void greet(){
        System.out.println("Helle, Good morning!!");
    }

    public void on(){
        System.out.println("Turning on the phone...");
    }
}

class SmartPhone extends Phone {

    public void music(){
        System.out.println("Play music!!!");
    }

    public void on(){
        System.out.println("Turning on the smartphone...");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {

/*        // Allowed case
        Phone p = new Phone();
        p.on();
        p.greet();

        SmartPhone sp = new SmartPhone();
        sp.on();
        sp.music();*/

        Phone obj = new SmartPhone();  // Dynamic method dispatch
        obj.greet();
        obj.on();
/*
        obj.music();  // using super class referenced cant access subclass method
*/

        // not allowed
       /* SmartPhone ob = new Phone(); // smartphone cant be referenced the phone
       */

    }
}
