package com.mycompany.foreach;

/**
 * ForEach em Java.
 * Autor: Bernardo
 * Data: Julho de 2025
 */
public class ForEach {

    public static void main(String[] args) {
        String[] vect = new String[]{"Maria", "Bob", "Alex"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("--------------------");

        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}
