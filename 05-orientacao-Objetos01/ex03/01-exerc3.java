package com.mycompany.exerc3;
/**
 * Exercício de orientação a objetos em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Exerc3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Student nota = new Student();
        
        System.out.print("Nome: ");
        nota.name = sc.nextLine();
        System.out.print("Nota 1(0 a 30): ");
        nota.a = sc.nextDouble();
        System.out.print("Nota 2(0 a 35): ");
        nota.b = sc.nextDouble();
        System.out.print("Nota 3(0 a 35): ");
        nota.c = sc.nextDouble();
        
        System.out.println();
        System.out.printf("Nota final = %.2f%n",nota.gradeCalculation());
        
        if(nota.gradeCalculation()<60){
            System.out.println("Reprovado!!");
            System.out.printf("Faltam %.2f pontos%n",nota.missingGrade());
        }
        else{
            System.out.println("Aprovado!!");
        }
    }
}
