package com.Lesson27;
import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        File f = new File("test9.txt");

        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Vsem horoshego dnya");
        } catch (FileNotFoundException e) {
            System.out.println("Bill poyman exception: " + e);
        }
        finally {
            System.out.println("eto finaly block");
        }
    }
}
