package com.mycompany.encapsulamento;
/**
 * Encapsulamento em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Encapsulamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Product p = new Product();

        System.out.println("Insira os dados do produto:");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Preço: ");
        double price = sc.nextDouble();
        
         
        Product produto = new Product(name, price);
        
        produto.setName("Computador");
        System.out.println("Atualização do nome: " + produto.getName());
        
        produto.setPrice(1200.00);
        System.out.println("Atualização do preço: " + produto.getPrice());
        
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
