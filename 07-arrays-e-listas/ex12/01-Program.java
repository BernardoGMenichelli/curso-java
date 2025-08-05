package com.mycompany.exerc12;

/**
 * Exercício de array em Java. 
 * Autor: Bernardo 
 * Data: Junho de 2025
 */
import java.util.Scanner;

import entities.Person;

public class Exerc12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão reservados? ");
        int n = sc.nextInt();
        Person[] vect = new Person[10];

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Reserva #" + i);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int room = sc.nextInt();

            vect[room] = new Person(name, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}
