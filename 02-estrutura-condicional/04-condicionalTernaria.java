package com.mycompany.condicional_ternaria;
/**
 * Estrutura condicional ternária em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
public class Condicional_ternaria {

    public static void main(String[] args) {
        double preco = 34.5;
        double desconto = preco < 20? preco * 0.1 : preco * 0.05;
    System.out.println("Desconto = " + desconto);
    }
}
