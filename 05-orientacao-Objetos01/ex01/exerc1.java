package com.mycompany.exerc1;
/**
 * Exercício de orientação a objetos em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
import java.util.Locale;
import java.util.Scanner;
import entities.Retangle;

public class Exerc1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Retangle rect = new Retangle();
        
        System.out.println("Insira a altura e largura do retangulo: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();
        
        System.out.printf("Area: %.2f%n",rect.area());
        System.out.printf("Perimetro: %.2f%n",rect.perimeter());
        System.out.printf("Diagonal: %.2f%n",rect.diagonal());
        
        sc.close();
    }
}
