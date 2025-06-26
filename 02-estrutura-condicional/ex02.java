package com.mycompany.exerc_condicional2;
/**
 * Exercício de estrutura condicional em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
import java.util.Scanner;
import java.util.Locale;

public class exerc_condicional2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva as medidas do triangulo X:");
        double xA = sc.nextDouble();
        double xB = sc.nextDouble();
        double xC = sc.nextDouble();
        
        System.out.println("Escreva as medidas do triangulo Y:");
        double yA = sc.nextDouble();
        double yB = sc.nextDouble();
        double yC = sc.nextDouble();
        
        double pX = (xA + xB + xC)/2;
        double pY = (yA + yB + yC)/2;
        
        double areaX = Math.sqrt(pX*(pX-xA)*(pX-xB)*(pX-xC));
        double areaY = Math.sqrt(pY*(pY-yA)*(pY-yB)*(pY-yC));
        
        System.out.printf("Area do triangulo X: %.4f%n",areaX);
        System.out.printf("Area do triangulo Y: %.4f%n",areaY);
        
        if(areaX > areaY){
        System.out.println("Maior area: X");
        }
        else{
        System.out.println("Maior area: Y");
        }
    }
}
