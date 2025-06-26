package com.mycompany.opbitwise;
/**
 * bitwise em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
import java.util.Scanner;

public class OpBitwise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //0b indica que se trata de um numero binario
        int mask = 0b100000; //ou 32, nesse caso
        
        System.out.println("Digite");
        int N = sc.nextInt();
       
        //lê bit a bit dos dois numeros e compara se os bits de cada linha são iguais
        //se o 6ºbit do numero digitado for = 1 o programa retorna true true
        if ((N & mask) != 0) {
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false");
        }
        sc.close();
    }
}
