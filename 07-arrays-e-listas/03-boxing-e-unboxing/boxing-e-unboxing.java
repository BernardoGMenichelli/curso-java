package com.mycompany.boxing;

/**
 * Boxing e unboxing em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
public class Boxing {

    public static void main(String[] args) {
        int x = 20;

        Integer obj = x; // Wrapper class
        System.out.println(obj);
        
        int y = obj * 2;
        System.out.println(y);
    }
}
