package com.mycompany.primeir_java;

import java.util.Scanner;
import java.util.Locale;

/**
 * Exemplo básico de entrada de dados em Java com Scanner.
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
        char a; 
        System.out.print("Digite um caractere: ");
        a = sc.next().charAt(0);
        System.out.println("Você digitou: " + a);
        
        // Encerra o Scanner
        sc.close();
    }
}
