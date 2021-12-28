package com.Lesson16.homework;

public class Dz {

    public void email(String str){
        int a = 0, b = 0, c = 0;

        while (c < str.length() - 1){
            System.out.print("Позиции (@, '.', ;): ");
            a = str.indexOf('@', c);
            b = str.indexOf('.', c);
            c = str.indexOf(';', c + 1);
            System.out.println("( " + a + " , " + b + " , " + c + " )");

            System.out.println(str.substring(a + 1, b));
        }
    }
}

class DzTest{
    public static void main(String[] args) {
        Dz em = new Dz();

        em.email("ya@yahoo.com; on@mail.tu; ona@gmail.com;");
    }
}
