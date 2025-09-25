package com.mycompany.polimorfismo;

/**
 * Polimorfismo em Java. 
 * Autor: Bernardo 
 * Data: Setembro de 2025
 */
import entities.Account;
import entities.SavingsAccount;

public class Polimorfismo {

    public static void main(String[] args) {
        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1020, "Alex", 1000.0, 1);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }
}
