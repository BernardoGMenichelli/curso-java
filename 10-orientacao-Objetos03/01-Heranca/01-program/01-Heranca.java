package com.mycompany.heranca;

/**
 * Herança em Java. 
 * Autor: Bernardo 
 * Data: Setembro de 2025
 */

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Heranca {

    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 1000.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 1);

        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount)acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        //Override
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        Account acc6 = new SavingsAccount(1005, "João", 1000.0, 1);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        Account acc7 = new BusinessAccount(1006, "Bruna", 1000.0, 500.0);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());
    }

}
