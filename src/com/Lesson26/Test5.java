package com.Lesson26;

public class Test5 {

    Test5(){
        System.out.println("konstr");
    }

    {
        System.out.println("init block 1");
    }
    {
        System.out.println("init block 2");
    }
    static {
        System.out.println("static init block");
    }

    public static void main(String[] args) {
        Test5 t1 = new Test5();
        Test5 t2 = new Test5();
    }
}
