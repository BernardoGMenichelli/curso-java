package com.mycompany.estaticos;
/**
 * Membros estáticos em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Estaticos {
   
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira o valor do raio: ");
        double radius = sc.nextDouble();
        
        double c = Calculator.circunference(radius);
        
        double v = Calculator.volume(radius);
        
        System.out.printf("Circunferencia: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("Valor de PI: %.2f%n",Calculator.PI);
    }
    
}
