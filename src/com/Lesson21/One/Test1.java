package com.Lesson21.One;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        var list1 = new ArrayList<String>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);

        Iterator<String> it = list1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Collections.sort(list1);

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
