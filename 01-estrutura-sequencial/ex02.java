package com.mycompany.bhaskara;

import java.util.Scanner;
/**
 * Bhaskara simples em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
public class Bhaskara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        double A = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double B = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        double C = sc.nextDouble();
        System.out.println();
    
        double delta,x1,x2;

        //b*b - 4*a*c
        //(-b + √delta)/2a
        //(-b - √delta)/2a
        delta = Math.pow(B, 2)-4*A*C;     
        x1 = (-B + Math.sqrt(delta))/2*A;
        x2 = (-B - Math.sqrt(delta))/2*A;
        
        System.out.println("Delta = " + delta);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        
        sc.close();
    }
}
