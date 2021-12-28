package com.Lesson27;

import java.io.*;

public class Test8 {
    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("test9.txt");
            try {
                fis2 = new FileInputStream("test10.txt");
            } catch (FileNotFoundException e) {
                System.out.println("Файл test10 не найден");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл 9 не найден");
        }
        finally {
            System.out.println("Это внешний finally блок");
            try{
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("Найденно исключение в finally блоке");
            }
        }
    }

    public static void main(String[] args) {
        Test8 t = new Test8();
        t.abc();
    }
}
