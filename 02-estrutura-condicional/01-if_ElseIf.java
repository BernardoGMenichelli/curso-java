package com.mycompany.estrutura_condicional;

import java.util.Scanner;
/**
 * Estrutura condicional if else em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
public class Estrutura_condicional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas horas?");
        int hora = sc.nextInt();
        
        if(hora < 12){
            System.out.println("Bom dia!!");
        }
        else if(hora < 18){
            System.out.println("Boa tarde!!"); 
        }
        else{
            System.out.println("Boa noite!!");
        }
        
        
        sc.close();
    }    
}
