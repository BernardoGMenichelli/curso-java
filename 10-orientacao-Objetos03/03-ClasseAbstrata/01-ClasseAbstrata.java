package com.mycompany.classeabstrata;

/**
 * Classe abstrata em Java. 
 * Autor: Bernardo 
 * Data: Outubro de 2025
 */

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ClasseAbstrata {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        /*
        //o tipo account não pode ser instanciado por conta do abstract
        //assim garantindo que so possam ser criadas contas poupanças e empresariais
        Account acc1 = new Account(1001, "Alex", 1000.0);
        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
         */
        
        List<Account> list = new ArrayList<>();
        
        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
        list.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));
        
        double sum = 0.0;
        for (Account acc : list){
            sum += acc.getBalance();
        }
        
        System.out.printf("Total Balance: %.2f%n", sum);
        
        for (Account acc : list){
            acc.deposit(10.0);
        }
        for (Account acc : list){
            System.out.printf("Updated Balance for account %d: %.2f%n ", acc.getNumber(), acc.getBalance());
        }
        
    }
}
