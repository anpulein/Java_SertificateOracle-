package com.Lesson19;

public class Test3 {
    public static void maxMin(double []arr){
        double max = arr[0];
        double min = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("min: " + min + ' ' + "max: " + max);
    }

    public static void main(String[] args) {
        double array[] = {1.05, -3.14, 8.0, 9.19, -3, 0};
        maxMin(array);
        maxMin(new double[] {2.5, -1.3});
    }
}


