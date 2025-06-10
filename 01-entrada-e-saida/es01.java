package com.mycompany.primeir_java;

import java.util.Scanner;
import java.util.Locale;

/**
 * Entrada de dados em Java com Scanner.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
public class Primeir_Java {

    public static void main(String[] args) {
        // Define o idioma para US (necessário para usar "." em números decimais)
        Locale.setDefault(Locale.US);

        // Cria o objeto Scanner para leitura de dados
        Scanner sc = new Scanner(System.in);

        // Entrada de texto (String)
        System.out.print("Digite seu nome: ");
        String nome = sc.next();
        System.out.println("Você digitou: " + nome);

        // Entrada de número inteiro (int)
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Você digitou: " + idade);

        // Entrada de número com ponto flutuante (double)
        System.out.print("Digite seu salário: ");
        double salario = sc.nextDouble();
        System.out.printf("Você digitou: %.2f%n", salario);
        
        // Entrada de caractere (char)
        System.out.print("Digite um caractere: ");
        char carac = sc.next().charAt(0);
        System.out.println("Você digitou: " + carac);
        
        // Ler vários dados na mesma linha
        System.out.println("Digite uma palavra, um número inteiro e um número decimal (separados por espaço):");
        String x = sc.next();
        int y = sc.nextInt();
        double z = sc.nextDouble();
        System.out.println("Dados digitados: " + x + " " + y + " " + z);
        
        
        // Encerra o Scanner
        sc.close();
    }
}
