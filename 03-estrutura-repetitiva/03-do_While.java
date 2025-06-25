package com.mycompany.estrutura_repetitiva3;
/**
 * Estrutura repetitiva do while em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
import java.util.Scanner;
import java.util.Locale;

public class Estrutura_repetitiva3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;
        
        //O bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final
        do{
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 *C/5+32;
            
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.printf("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        }while(resp != 'n'); 
        
    }
}
