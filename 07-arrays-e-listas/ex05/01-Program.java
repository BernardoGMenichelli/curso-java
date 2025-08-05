package com.mycompany.exerc5;

/**
 * Exercício de array em Java. 
 * Autor: Bernardo 
 * Data: Junho de 2025
 */
import java.util.Locale;
import java.util.Scanner;

public class Exerc5 {

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

        double valor = 0.0;
        int maior = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > valor) {
                valor = vect[i];
                maior = i;
            }
        }

        System.out.println();
        System.out.printf("Maior valor = %.1f%n", valor);
        System.out.println("Posição do maior valor = " + maior);

        sc.close();
    }
}
