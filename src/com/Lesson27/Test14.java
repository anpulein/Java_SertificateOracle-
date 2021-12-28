package com.Lesson27;

import java.io.IOException;

public class Test14 {
}

class Animal {
    void run() throws IOException {
        System.out.println("Animal runs");
    }
}

class Mouse extends Animal {
    void run() throws IOException {
        System.out.println("Mouse runs");
    }
}
