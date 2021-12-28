package com.Lesson21.homework;

import java.util.ArrayList;
import java.util.Collections;

public class LessOne {
    public static void abc(String ...arg){
        var list = new ArrayList<String>();
        for (String it: arg) {
            list.add(it);
        }
        Collections.sort(list);
        for (String it: list) {
            System.out.print(it + ' ');
        }
    }
}

class LessOneTest {
    public static void main(String[] args) {
        LessOne.abc("b", "c", "a", "d");
    }
}
