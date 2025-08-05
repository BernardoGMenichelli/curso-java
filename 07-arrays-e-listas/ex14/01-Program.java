package com.mycompany.exerc14;

/**
 * Exercício de matriz em Java. 
 * Autor: Bernardo 
 * Data: Julho de 2025
 */
import java.util.Scanner;

public class Exerc14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] mat = new int[M][N];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("posição " + i + "," + j + ": ");
                    if (j > 0) {
                        System.out.println("Esquerda: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Acima: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Direita: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Abaixo: " + mat[i + 1][j]);
                    }

                }
            }
        }

    }
}
/*
    j   j   j   j
i    10 8 15 12
i    21 11 23 8
i    14 5 13 19
*/
