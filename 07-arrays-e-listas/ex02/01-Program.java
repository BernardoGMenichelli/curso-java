package com.mycompany.exerc2;

/**
 * Exercício de array em Java. 
 * Autor: Bernardo 
 * Data: Julho de 2025
 */
import java.util.Locale;
import java.util.Scanner;

public class Exerc2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i];
        }

        System.out.println();

        System.out.print("Valores = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
        }

        System.out.printf("%nSoma = %.2f%n", soma);
        System.out.printf("Media = %.2f%n", soma / vect.length);

        sc.close();
    }
}
