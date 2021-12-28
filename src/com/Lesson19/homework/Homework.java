package com.Lesson19.homework;

public class Homework {
    static int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] >= arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] array = {1, -5, 2, -1, 3};
        for (int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
        array = sort(array);
        for (int i: array) {
            System.out.print(i + " ");
        }
    }
}
