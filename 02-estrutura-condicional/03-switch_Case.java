package com.mycompany.estrutura_switch;
/**
 * Estrutura condicional switch case em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
import java.util.Scanner;

public class Estrutura_switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um valor de 1 a 7: ");
        int semana = sc.nextInt();
       
        String dia;
        
        switch(semana){
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sábado";
                break;
            default:
                dia = "valor invalido";
                break;
        }
        
        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}
