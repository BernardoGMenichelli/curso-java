package com.mycompany.exerc9;

/**
 * Exercício de array em Java. 
 * Autor: Bernardo 
 * Data: Julho de 2025
 */
import java.util.Scanner;

import entities.Person;

public class Exerc9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        Person[] vect = new Person[n];
        int older = 0;
        int loc = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();

            vect[i] = new Person(name, age);

            if (older < vect[i].getAge()) {
                older = vect[i].getAge();
                loc = i;
            }
        }
        System.out.println("Pessoa mais velha: " + vect[loc].getName());

        sc.close();
    }
}
