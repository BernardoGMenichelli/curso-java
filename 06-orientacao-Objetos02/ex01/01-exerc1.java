package com.mycompany.exerc1;

/**
 * Exercício de OO em Java. 
 * Autor: Bernardo 
 * Data: Junho de 2025
 */
import java.util.Locale;
import java.util.Scanner;
import entities.Client;

public class Exerc1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Client cliente;

        System.out.print("Insira o numero da conta: ");
        int numeroDaConta = sc.nextInt();

        System.out.print("Insira o nome do titular da conta: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.print("Existe depósito inicial (s/n)? ");
        char caractere = sc.next().charAt(0);

        if (caractere == 's') {
            System.out.print("Insira o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            cliente = new Client(nome, numeroDaConta, depositoInicial);
        } else {
            cliente = new Client(nome, numeroDaConta);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(cliente.toString());

        System.out.println();
        System.out.print("Insira um valor de depósito: ");
        double valorDepositado = sc.nextDouble();
        cliente.deposito(valorDepositado);

        System.out.println("Dados da conta atualizados:");
        System.out.println(cliente.toString());

        System.out.println();
        System.out.print("Insira um valor de retirada: ");
        double valorRetirado = sc.nextDouble();
        cliente.retirarValor(valorRetirado);

        System.out.println();
        System.out.println("Dados da conta atualizados:");
        System.out.println(cliente.toString());

        sc.close();
    }
}
