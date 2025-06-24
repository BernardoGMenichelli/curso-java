package com.mycompany.estrutura_repetitiva;
/**
 * Estrutura repetitiva while em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
import java.util.Scanner;

public class Estrutura_repetitiva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int x = sc.nextInt();
        
        int soma = 0;
        //V: executa e volta
        //F: pula fora
        while(x != 0){ //quando digitar 0 o while se torna false e para de repetir
            soma += x;
            x = sc.nextInt();
        }
        
        System.out.println("Soma = " + soma);
        
        sc.close();
    }
}
