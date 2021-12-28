package com.Lesson27;

public class Test9 {
    void abc() {
        int [] array = {1, 2, 3};
        try {
            System.out.println(array[7]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            String s = null;
            System.out.println(s.length());
        }
        catch (NullPointerException e) {
            System.out.println("Пойман NullPointerException");
        }
    }

    public static void main(String[] args) {
        Test9 t = new Test9();
        t.abc();
    }
}
