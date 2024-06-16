package com.company;

public class ArrClass {
    public static void main(String[] args) {

//        Indexed array
//        int [] marks = new int[5];
//        int [] marks = {98, 86,80,79,91};
//        System.out.println(marks[2]);
//        System.out.println(marks.length);
//
//        forEach loop
//        for (int element: marks){
//            System.out.println(element);
//        }

//        Multidimensional array
//        int [][] flats = new int[2][3];
//        flats[0][0] = 101;
//        flats[0][1] = 102;
//        flats[0][2] = 103;
//        flats[1][0] = 201;
//        flats[1][1] = 202;
//        flats[1][2] = 203;
//
//        for (int i = 0; i < flats.length; i++) {
//            for (int j = 0; j < flats[i].length; j++) {
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.print("\n");
//        }


//        practice 1:
/*
        float sum = 0.0f;
        float [] val = {12.3f,45.0f,63,34.9f,98.2f};
       for (int i = 0; i < val.length; i++) {
//            System.out.println(val[i]);
            sum += val[i];
        }
        System.out.println(sum);
        OR
        for(float element: val){
            sum += element;
        }
        System.out.println(sum);
 */

/*        Practice 2:
        float [] value = {12.3f,45.0f,63,34.9f,98.2f};
        float num = 65;
        boolean isInArray = false;
        for (float el: value){
            if(num==el){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("This value is in array.");
        }else {
            System.out.println("This value is not in array.");
        }
        */

/*
//    Practice 3:

       float sum = 0.0f;
       float avg = 1;
       float [] val = {12.3f,45.0f,63,34.9f,98.2f};
       for (int i = 0; i < val.length; i++) {
            sum += val[i];
            avg = sum / val.length;
        }
        System.out.println(avg);

*/

/*
//        practice 4:

        int [] arr = {2,5,9,11,36,45,59,78,96};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int el: arr){
            System.out.print(el + ", ");
        }
*/

/*
//        Practice 5:
        int [] array = {45,708,915,600,841,23};
//        int max = Integer.MIN_VAlUE;
        int max = 0;
        for (int element: array){
            if (element > max) {
                max = element;
            }
        }
        System.out.println(max);

*/

//        Practice 6

        int [] ar = {21,63,7,87,45,16,};
        boolean isSorted = true;
        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i] > ar[i+1]) {
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array sorted");
        }else {
            System.out.println("Array not sorted");
        }


    }
}
