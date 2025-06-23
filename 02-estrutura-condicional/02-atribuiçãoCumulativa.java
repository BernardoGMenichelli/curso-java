package com.mycompany.atrib_cumulativa;

import java.util.Scanner;
/**
 * Atribuição cumulativa em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
public class Atrib_cumulativa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de mintuos consumidos: ");
        int minutos = sc.nextInt();
        
        double conta = 50.0;
        
        if(minutos > 100){
            conta += (minutos-100) * 2.0;
            //mesma coisa que: conta = conta + (minutos-100) * 2.0;
        }
        
        System.out.printf("Valor da conta  = R$ %.2f%n",conta);
        
        sc.close();
        
    }
}
