package com.Lesson5.homework.Bank;

public class BankAccount {

    int id;
    String name;
    double balance;

    void popolnenineScheta(double balance){
        this.balance += balance;
    }

    void sbyatieScheta(double balance){
        this.balance -= balance;
    }

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YoutAccount = new BankAccount();
        BankAccount MiAccount = new BankAccount();

        MyAccount.id = 1;
        MiAccount.name = "Dima";
        MyAccount.balance = 12.35;

        System.out.println(MyAccount.name);
    }
}
