package com.mycompany.exerc3;

/**
 * Exercicio de herança em Java. 
 * Autor: Bernardo 
 * Data: Outubro de 2025
 */

import entities.Company;
import entities.Individual;
import entities.TaxPayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exerc3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax Payer #" + (i + 1) + " data:");
            System.out.print("Individual or company(i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            double anualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("number of employees: ");
                int numberOfEmployees = sc.nextInt();

                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        double totalTax = 0.0;
        for (TaxPayer payer : list) {
            System.out.printf("%s: $ %.2f%n", payer.getName(), payer.tax());
            totalTax += payer.tax();
        }
        
        System.out.println();
        System.out.printf("TOTAL TAXES: $%.2f%n",totalTax);
    }
}
