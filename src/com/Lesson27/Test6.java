package com.Lesson27;
import java.io.*;

public class Test6 {

    void abc() throws FileNotFoundException{
        try {
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("exception poyman");
            throw e;
        }
        finally {
            System.out.println("eto block finally");
        }
    }


    void method() {
        try {
            abc();
        } catch (FileNotFoundException e){
            System.out.println("Exception пойман и полностью обработанe");
        }
    }


//    void def() {
//        try {
//            int [] array = {1, 2, 3};
//            System.out.println(array[5]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("exception poyman");
//            throw e;
//        }
//        finally {
//            System.out.println("eto block finally");
//        }
//    }


}
