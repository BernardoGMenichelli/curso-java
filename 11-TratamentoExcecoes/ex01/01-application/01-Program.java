package com.mycompany.exerc1;

/**
 * Exercicio de tratamento de exceções em Java. 
 * Autor: Bernardo 
 * Data: Outubro de 2025
 */

import java.util.Locale;
import java.util.Scanner;
import model.entities.Account;
import model.exceptions.BalanceException;

public class Exerc1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();
        
        Account acc = new Account(number, holder, balance, withdrawLimit);
        
        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();
        
        try{
        acc.withdraw(amount);
        
        System.out.printf("New balance: %.2f%n",acc.getBalance());
        
        } catch (BalanceException e){
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Unexpected error!");
        } finally {
            sc.close();
        }

    }
}
