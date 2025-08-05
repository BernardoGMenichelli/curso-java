package com.mycompany.exerc7;

/**
 * Exercício de array em Java. 
 * Autor: Bernardo 
 * Data: Julho de 2025
 */
import java.util.Locale;
import java.util.Scanner;

public class Exerc7 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();

            soma += vect[i];
        }

        System.out.println();
        System.out.printf("Media do vetor = %.3f%n", soma / n);

        System.out.println("Elementos abaixo da media: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < soma / n) {
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}
