package com.mycompany.exerc4;

/**
 * Exercício de array em Java. 
 * Autor: Bernardo 
 * Data: Julho de 2025
 */
import java.util.Scanner;

public class Exerc4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int par = 0;
        System.out.println();
        System.out.println("Numeros pares:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.print(vect[i] + " ");
                par++;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Quantidade de pares = " + par);
        
        sc.close();
    }
}
