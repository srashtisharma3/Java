package com.company;

// For square
/*class CalculateSquare{
    int side;

    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}*/

// For rectangular
/*class CalculateRectangular{
    int length;
    int breath;

    public int area(){
        return length*breath;
    }

    public int perimeter(){
        return 2*(length+breath);
    }
}*/

// For Circle
class CalculateCircle{
    int radius;

    public float area(){
        return 3.14f * radius * radius;
    }

    public float perimeter(){
        return 2 * 3.14f * radius;
    }

}


public class Assignment1 {

    public static void main(String[] args) {

        // For square
/*        System.out.println("Calculating the Square value: ");
        CalculateSquare a = new CalculateSquare();

        a.side = 5;

        int area = a.area();
        int perimeter = a.perimeter();

        System.out.print(" Area " + area);
        System.out.println(" and perimeter " + perimeter);*/

        // For Rectangular
/*
        System.out.println("Calculating the Rectangular value : ");

        CalculateRectangular x = new CalculateRectangular();
        x.length = 4;
        x.breath = 3;

        int area = x.area();
        int perimeter = x.perimeter();
        System.out.println("Area " + area);
        System.out.println("Perimeter " + perimeter);
*/

        // For Circle
        System.out.println("Calculating the Rectangular value : ");

        CalculateCircle x = new CalculateCircle();
        x.radius = 4;

        float area = x.area();
        float perimeter = x.perimeter();
        System.out.println("Area : " + area);
        System.out.println("Circumference : " + perimeter);

    }
}
