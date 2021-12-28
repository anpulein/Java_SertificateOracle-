package com.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test2 {
    public static void main(String[] args) throws Exception{
        File f = new File("test9.tst");
        FileInputStream file = new FileInputStream(f);
        file.read();
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(100);
    }
}
