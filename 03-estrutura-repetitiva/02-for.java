package com.mycompany.estrutura_repetitiva2;
/**
 * Estrutura repetitiva for em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
import java.util.Scanner;

public class Estrutura_repetitiva2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int soma = 0;
        
        System.out.print("Digite valor de N: ");
        int N = sc.nextInt();
        
        //repete um bloco de comandos para um certo intervalo de valores
        for(int i = 0; i < N; i++){
            System.out.print("Digite valor de X: ");
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println("Soma = " + soma);
        System.out.println("");
        
        //criar contagem
        System.out.println("Contagem");
        for (int i=0; i<5; i++) {
            System.out.println("Valor de i: " + i);
        }
        System.out.println("");
        
        //criar contagem regressiva
        System.out.println("Contagem regressiva");
        for (int i=4; i>=0; i--) {
            System.out.println("Valor de i: " + i);
        }
        
        sc.close();
    }
}
