package com.mycompany.pilhadechamada;

/**
 * Tratamento de exceções em Java. 
 * Autor: Bernardo 
 * Data: Setembro de 2025
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class PilhaDeChamada {

    public static void main(String[] args) {
        method1();
        System.out.println("END OF PROGRAM");
    }

    public static void method1() {
        System.out.println("*******method1 start********");
        method2();
        System.out.println("*******method1 end********");
    }

    public static void method2() {
        System.out.println("*******method2 start********");
        Scanner sc = new Scanner(System.in);
        try {
            String vect[] = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            //imprime na tela o rastreamento do stack
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
        sc.close();
        System.out.println("*******method2 end********");
    }
}
