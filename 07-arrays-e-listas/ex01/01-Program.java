package com.mycompany.exerc1;

/**
 * Exercício de array em Java. 
 * Autor: Bernardo 
 * Data: Julho de 2025
 */
import java.util.Scanner;

public class Exerc1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar(limite de 10)? ");
        int n = sc.nextInt();

        if (n <= 10) {
            int[] vect = new int[n];

            for (int i = 0; i < vect.length; i++) {
                System.out.print("Digite um numero: ");
                vect[i] = sc.nextInt();
            }

            System.out.println("Numeros negativos: ");
            for (int i = 0; i < vect.length; i++) {
                if (vect[i] < 0) {
                    System.out.println(vect[i]);
                }
            }

        } else {
            System.out.println("O valor excede o limite!");

        }
        sc.close();
    }
}
