package com.Lesson27;
import java.io.*;

public class Test5 {

    static StringBuilder abc(){
        StringBuilder a = new StringBuilder("privet");
        try {
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("exception poyman");
            System.out.println("переменная в catch блоке = " + a);
            return a;
        }
        finally {
            a.append("!!!");
            System.out.println("eto block finally");
            System.out.println("переменная в finall блоке = " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
