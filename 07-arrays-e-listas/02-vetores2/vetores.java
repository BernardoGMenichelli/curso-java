package com.mycompany.vetores1;

/**
 * Vetores em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Vetores1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o numero de produtos a serem calculados: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        //da na mesma usar a variavel n e a vect.length, mas é melhor usar o 
        //.length para não depender de uma variavel não atrelada ao vetor
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Insira os dados do produto nº" + (i + 1) + ": ");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Preço: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);

        }
        double soma = 0.0;

        for (int i = 0; i < vect.length; i++) {
            //para pegar somente o preço do objeto
            soma += vect[i].getPrice();
        }

        System.out.println();
        System.out.printf("Preço medio = %.2f%n", soma / vect.length);
        sc.close();
    }
}
