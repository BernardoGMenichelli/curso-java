package com.mycompany.vetores;
/**
 * Vetores em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
import java.util.Locale;
import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Insira o numero de alturas a serem calculadas: ");
        int n = sc.nextInt();
        
        double[] vect = new double[n];
        
        for(int i=0; i<n; i++){
            System.out.print("Insira a altura nº" + (i+1) + ": ");
            vect[i] = sc.nextDouble();
        }
        
        double soma = 0.0;
        for(int i=0; i<n; i++){
            soma += vect[i];
        }
        
        System.out.printf("Altura media: %.2f%n",soma/n);
        
        sc.close();
    }
}
