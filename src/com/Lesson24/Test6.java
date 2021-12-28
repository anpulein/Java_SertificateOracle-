package com.Lesson24;

public class Test6 {
}

interface I3 {
    private static void method1() {
        System.out.println("static method");
    }

    private void method2() {
        System.out.println("non-static method");
    }

    default void method3() {
        method2();
        method1();
    }
}
