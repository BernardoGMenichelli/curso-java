package com.mycompany.program;
/**
 * Criar classes em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Produto produto = new Produto(); 
        System.out.println("Insira os dados do produto:");
        System.out.print("Nome: ");
        produto.name = sc.nextLine();
        System.out.print("Preço: ");
        produto.price = sc.nextDouble();
        System.out.print("Quantidade no estoque: ");
        produto.quantity = sc.nextInt();
        
        System.out.println();
        System.out.println("Dados do produto: " + produto); 
        
        System.out.println();
        System.out.print("Insira o número de produtos a serem adicionados ao estoque: ");
        int quantity = sc.nextInt();
        produto.addProducts(quantity);
        
        System.out.println();
        System.out.println("Dados atualizados: " + produto);
        
        System.out.println();
        System.out.print("Insira o número de produtos a serem removidos do estoque: ");
        quantity = sc.nextInt();
        produto.removeProducts(quantity);
        
        System.out.println();
        System.out.println("Dados atualizados: " + produto);
        
        sc.close();
    }
}
