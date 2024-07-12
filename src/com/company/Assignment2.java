package com.company;

class Circle {
    public int radius;

    Circle(int r){
        this.radius = r;
    }

    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder extends Circle{

    public int height;

    Cylinder(int r, int h) {
        super(r);
        this.height = h;
    }

    public double volume(){
        return Math.PI * this.radius * this.radius * height;
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Circle c = new Circle(4);
        double area = c.area();
        System.out.println(area);

        Cylinder cy = new Cylinder(4, 10);
        double v = cy.volume();
        System.out.println(v);
    }
}
