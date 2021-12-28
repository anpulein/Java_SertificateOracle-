package com.Lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("privet");
//
//        String s10 = s1.substring(3); // Срезает начало и до индекса
//        System.out.println(s10);
//        System.out.println(s1);
//
//        String s11 = s1.substring(3, 7); // срезает от 3 до 7 индекса
//
//        String s12 = s1.trim(); // У берает пробелы по бокам

        String s13 = s1.replace('r', 'z'); // String - замена char
        System.out.println(s13);
        s13 = s1.replace("vet", "vivka"); // String - замена Strong
        System.out.println(s13);
    }
}
