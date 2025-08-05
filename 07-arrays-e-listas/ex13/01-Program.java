package com.mycompany.exerc13;

/**
 * Exercício de lista em Java. 
 * Autor: Bernardo 
 * Data: Julho de 2025
 */
import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exerc13 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Funcionário #" + i + ":");

            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("ID já obtido. Tente novamente: ");
                id = sc.nextInt();
            }
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salário: ");
            Double salary = sc.nextDouble();
            System.out.println();

            list.add(new Employee(id, name, salary));

        }

        System.out.print("Insira o id do funcionario que receberá o aumento: ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("Esse id não existe!");
        } else {
            System.out.print("Insira a porcentagem: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("Lista dos funcionários: ");
        for (Employee x : list) {
            System.out.println(x);

        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
