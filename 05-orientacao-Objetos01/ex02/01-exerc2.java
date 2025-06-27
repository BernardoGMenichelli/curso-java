package com.mycompany.exerc2;
/**
 * Exercício de orientação a objetos em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Exerc2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Employee emp = new Employee();
        
        System.out.print("Nome: ");
        emp.name = sc.nextLine();
        System.out.print("Salario bruto: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Taxa: ");
        emp.tax = sc.nextDouble();
        
        System.out.println();
        System.out.println("Funcionario: " + emp);
       
        System.out.println();
        System.out.print("Qual percentual adicionar ao salário? ");
        double percent = sc.nextDouble();
        emp.increaseSalary(percent);
        
       System.out.println();
       System.out.println("Dados atualizados: " + emp);       
    }
}
