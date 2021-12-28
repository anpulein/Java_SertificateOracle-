package com.Lesson31;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
//        var a1 = new ArrayList<String>();
        Info <String> info1 = new Info<>("privet");
        System.out.println(info1);
    }

//    public void info(Info<String> info) {
//        String s = info.getValue();
//    }
//
//    public void  info(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
}


class Info <T> {
    private T value;
    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[{ " + value + " }]";
    }

    public T getValue() {
        return value;
    }
}


class Parent {
    public void abc(Info<Integer> info) {
        Integer i = info.getValue();
    }
}

//class Child extends  Parent {
//    public void abc(Info<String> info) {
//        String i = info.getValue();
//    }
//}
