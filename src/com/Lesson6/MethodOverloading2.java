package com.Lesson6;

public class MethodOverloading2 {
    int sum(int a, int b){
        return a + b;
    }

    String sum(String a, String b){
        return a + b;
    }
}

class MethodOverloading2Test{
    public static void main(String[] args) {
        MethodOverloading2 methodOver = new MethodOverloading2();

        int a = methodOver.sum(5, 17);
        System.out.println(a);

        String s = methodOver.sum("privet", "my friend");
        System.out.println(s);
    }
}
