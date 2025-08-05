package com.mycompany.exerc11;

/**
 * Exercício de array em Java. 
 * Autor: Bernardo 
 * Data: Julho de 2025
 */
import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Exerc11 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Person[] vect = new Person[n];
        int men = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            double height = sc.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            char gender = sc.next().charAt(0);

            if (gender == 'm' || gender == 'M') {
                men++;
            }

            vect[i] = new Person(height, gender);
        }

        double mHeight = vect[0].getHeight();
        double bHeight = 0.0;
        double soma = 0.0;
        int woman = 0;

        for (int i = 0; i < vect.length; i++) {
            if (mHeight > vect[i].getHeight()) {
                mHeight = vect[i].getHeight();
            }
            if (bHeight < vect[i].getHeight()) {
                bHeight = vect[i].getHeight();
            }
            if (vect[i].getGender() == 'f' || vect[i].getGender() == 'F') {
                soma += vect[i].getHeight();
                woman++;
            }

        }

        System.out.printf("%nMenor altura = %.2f%n", mHeight);
        System.out.printf("Maior altura = %.2f%n", bHeight);
        System.out.printf("Media da altura das mulheres = %.2f%n", soma / woman);
        System.out.printf("Numero de homens = %d%n", men);
        
        sc.close();
    }
}
