package com.Lesson24;

public class Test5 {
}

interface I1 {
    void abc();
    default void ghi(){
        System.out.println("Это метод ghi");
    }
    default void def(){
        System.out.println("Это метод def");
    }
}
class Z1 implements I1{
    public void abc() {
        System.out.println("Это метод abc");
    }

    public static void main(String[] args) {
        Z1 z = new Z1();
        z.abc();
        z.ghi();
        z.def();
    }
}