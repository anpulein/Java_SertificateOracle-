package com.Lesson4;

public class BankAccount {

    int id;
    String name;
    double balance;

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
