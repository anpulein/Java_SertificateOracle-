//package com.Lesson29;
//import java.util.ArrayList;
//
//public class Test1 {
//    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<>();
//        Student st1 = new Student("Ivan", 'm',22, 3, 8.3);
//        Student st2 = new Student("Nikolay", 'm',28, 2, 6.4);
//        Student st3 = new Student("Elena", 'f',19, 1, 8.9);
//        Student st4 = new Student("Petr", 'm',35, 4, 7);
//        Student st5 = new Student("Mariya", 'f',23, 3, 9.1);
//        list.add(st1);
//        list.add(st2);
//        list.add(st3);
//        list.add(st4);
//        list.add(st5);
//
//        StudentInfo si = new StudentInfo();
//        si.printStudentOverGrade(list, 8.5);
//        System.out.println("----------------------------------------------------->");
//        si.printStudentUnderGrade(list, 9);
//        System.out.println("----------------------------------------------------->");
//        si.printStudentOverAge(list, 25);
//        System.out.println("----------------------------------------------------->");
//        si.printStudentUnderAge(list, 27);
//        System.out.println("----------------------------------------------------->");
//        si.printStudentBySex(list, 'm');
//        System.out.println("----------------------------------------------------->");
//        si.printStudentMixConditions(list, 7.2, 23, 'f');
//    }
//}

//
//class Student {
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//
//    public Student(String name, char sex, int age, int course, double avgGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//
//class StudentInfo {
//    void printStudent(Student st) {
//        System.out.println("Имя студента: " + st.name + ", пол: " + st.sex + ", возвраст: " + st.age + ", курс: " + st.course + ", Средняя оценка: " + st.avgGrade);
//    }
//
//    void printStudentOverGrade(ArrayList <Student> aL, double avgGrade) {
//        for (Student s : aL) {
//            if(s.avgGrade > avgGrade) {
//                printStudent(s);
//            }
//        }
//    }
//    void printStudentUnderGrade(ArrayList <Student> aL, double avgGrade) {
//        for (Student s : aL) {
//            if(s.avgGrade > avgGrade) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentOverAge(ArrayList <Student> aL, int age) {
//        for (Student s : aL) {
//            if(s.age > age) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentUnderAge(ArrayList <Student> aL, int age) {
//        for (Student s : aL) {
//            if(s.age > age) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentBySex(ArrayList <Student> aL, char sex) {
//        for (Student s : aL) {
//            if(s.sex == sex) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentMixConditions(ArrayList <Student> aL, double avgGrade, int age, char sex) {
//        for (Student s : aL) {
//            if(s.avgGrade > avgGrade && s.age < age && s.sex == sex) {
//                printStudent(s);
//            }
//        }
//    }
//}
