package com.mycompany.exerc8;

/**
 * Exercício de array em Java. 
 * Autor: Bernardo 
 * Data: Junho de 2025
 */
import java.util.Scanner;
import java.util.Locale;

public class Exerc8 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        double soma = 0.0;
        int par = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();

            if (vect[i] % 2 == 0) {
                soma += vect[i];
                par++;
            }
        }

        if (par > 0) {
            System.out.printf("Media dos Pares %.1f%n", soma / par);
        } else {
            System.out.println("Nenhum numero par");
        }
        sc.close();
    }
}
