package com.mycompany.exerc3;

/**
 * Exercício de array em Java. 
 * Autor: Bernardo 
 * Data: Julho de 2025
 */
import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Exerc3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Person[] vect = new Person[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados da " + (i + 1) + " Pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();

            vect[i] = new Person(name, age, height);
        }
        
        double soma = 0;
        int menor = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                menor++;
            }
            soma += vect[i].getHeight();
        }
        
        System.out.println();
        System.out.printf("Altura media: %.2f%n", soma / vect.length);
        
        double percent = ((double)menor * 100) / n;
        // 5 = 100
        // 2 = x 

        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", percent);

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());

            }

        }
        sc.close();
    }
}
