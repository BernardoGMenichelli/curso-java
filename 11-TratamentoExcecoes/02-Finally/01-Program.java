package com.mycompany.blocofinally;

/**
 * Tratamento de exceções em Java. 
 * Autor: Bernardo 
 * Data: Setembro de 2025
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BlocoFinally {

    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } //executa independente do try dar certo ou não
        finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Finally block executed");
        }
    }
}
