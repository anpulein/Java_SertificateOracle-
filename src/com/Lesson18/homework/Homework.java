package com.Lesson18.homework;

public class Homework {

    boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean result = true;
        if(sb1.length() == sb2.length()){
            for (int i = 0; i < sb1.length(); i++){
                if(sb1.charAt(i) != sb2.charAt(i)){
                    result = false;
                    break;
                }
            }
        }
        else {
            result = false;
        }
        return result;
    }
}

class HomeworkTest{
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("1");
        StringBuilder sb2 = new StringBuilder("1");
        Homework hm = new Homework();
        boolean b = hm.ravenstvo(sb1, sb2);
        System.out.println(b);
    }
}
