package com.mycompany.exerc4;
/**
 * Exercício de membros estáticos em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Exerc4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("preço do dolar: ");
        double price = sc.nextDouble();
        
        System.out.print("Quantidade de dolares: ");
        double dollar = sc.nextDouble();
        
        double real = CurrencyConverter.taxCalculate(price, dollar); 
        
        System.out.printf("Quantidade a ser paga em reais: %.2f",real);
    }
}
