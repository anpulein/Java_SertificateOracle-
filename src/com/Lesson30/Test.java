package com.Lesson30;

public class Test {

}


interface I {
    void abc();

    default void def() {};
    default void def2() {};
    static void def3() {};
}