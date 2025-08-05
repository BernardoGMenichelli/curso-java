package com.mycompany.exerc10;

/**
 * Exercício de array em Java. 
 * Autor: Bernardo 
 * Data: Julho de 2025
 */
import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Exerc10 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        double[] media = new double[n];
        Person[] vect = new Person[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
            sc.nextLine();
            String name = sc.nextLine();
            double semester1 = sc.nextDouble();
            double semester2 = sc.nextDouble();

            vect[i] = new Person(name, semester1, semester2);

            media[i] = (semester1 + semester2) / 2;
        }
        System.out.println("Alunos aprovados:");
        for (int i = 0; i < media.length; i++) {
            if (media[i] >= 6.0) {
                System.out.println(vect[i].getName());
            }
        }
        sc.close();
    }
}
