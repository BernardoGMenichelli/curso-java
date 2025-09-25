package com.mycompany.exerc1;

/**
 * Exercício de enumeração em Java. 
 * Autor: Bernardo 
 * Data: Agosto de 2025
 */
import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exerc1 {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Insira o nome do departamento: ");
        String department = sc.nextLine();
        System.out.println("Insira os dados do trabalhador:");
        System.out.print("Nome: ");
        String workername = sc.nextLine();
        System.out.print("Nível: ");
        String workerlevel = sc.nextLine();
        System.out.print("Salário base: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workername, WorkerLevel.valueOf(workerlevel), baseSalary, new Department(department));
        
        System.out.print("Quantos contratos esse trabalhador terá? ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++){
            System.out.println("Insira os dados do #" + i + " contrato: ");
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duração do contrato(horas): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate,valuePerHour,hours);
            worker.addContract(contract);
        }
        
        System.out.println();
        System.out.print("Insira o mes e o ano para a renda ser calculada(MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        
        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Renda de " + monthAndYear + ": " + String.format("%.2f",worker.income(year, month)));
        
        sc.close();
    }
}
