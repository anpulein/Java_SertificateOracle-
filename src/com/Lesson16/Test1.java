package com.Lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("abcdeggabcd");

        int a = s1.length();
        System.out.println(a); // Длина массива

        char c1 = s1.charAt(3);
        System.out.println(c1); // Выводит по индексу элемент

        int i1 = s1.indexOf('t');
        System.out.println(i1); // Выводит индекс элемента

        int i2 = s1.indexOf("vet");
        System.out.println(i2); // Выводит индекс начало 1 char данной строки

        int i3 = s1.indexOf('a', 5);
        System.out.println(i3); // Выводит первое вхожждение char по индексу начиная с 5 индекса

        boolean b1 = s1.startsWith("abc");
        System.out.println(b1); // Начинаелся ли исходная строки с данной подстроки
        b1 = s1.endsWith("abc");
        System.out.println(b1); // Заканчивается д=ли исходная строка с данной подстрокой

        boolean b2 = s1.startsWith("abc", 7);
        System.out.println(b2); // Начинаелся ли исходная строки с данной подстроки начнина с конкретного индекса

    }
}
