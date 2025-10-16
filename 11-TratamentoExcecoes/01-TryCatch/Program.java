package com.mycompany.trycatch;

/**
 * Tratamento de exceções em Java. 
 * Autor: Bernardo 
 * Data: Setembro de 2025
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            String vect[] = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
        }
        catch (InputMismatchException e){
            System.out.println("Input error!");
        }
        System.out.println("END OF PROGRAM");
        sc.close();
    }
}
