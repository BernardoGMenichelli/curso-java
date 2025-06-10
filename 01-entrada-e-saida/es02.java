package com.mycompany.entrada_de_dados_2;

import java.util.Scanner;
/**
 * Entrada de dados em Java com Scanner2.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
public class Entrada_de_dados_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ler texto até a quebra de linha
        System.out.println("Digite três linhas de texto:");
        String x1 = scanner.nextLine();
        String x2 = scanner.nextLine();
        String x3 = scanner.nextLine();

        System.out.println("\nDados digitados:");
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

        // Ler um número inteiro
        System.out.println("\nDigite um número inteiro:");
        int y = scanner.nextInt();
        scanner.nextLine(); //Limpa o buffer de leitura

        // Ler mais três linhas de texto
        System.out.println("Digite mais três linhas de texto:");
        String z1 = scanner.nextLine();
        String z2 = scanner.nextLine();
        String z3 = scanner.nextLine();

        System.out.println("\nDados digitados:");
        System.out.println(y);
        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);

        scanner.close();
    }
}
