package com.Lesson19;

public class Test2 {
    public static void main(String[] args) {
        int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array2[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array3[] = array2;
        System.out.println(array1 == array2);
        System.out.println(array3 == array2);
        System.out.println(array1.equals(array2)); // Работает так же как и ==
        
    }
}
