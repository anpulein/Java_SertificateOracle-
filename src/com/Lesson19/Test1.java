package com.Lesson19;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};

        for (int i: array1) {
            System.out.print(i + " ");
        }
        System.out.println();

        Arrays.sort(array1); // Сортировка массива от меньшего к большему
        for (int i: array1) {
            System.out.print(i + " ");
        }

        System.out.println();
        int index1 = Arrays.binarySearch(array1, 1); // Возвращает индекс элемента
        System.out.println(index1);
    }
}
