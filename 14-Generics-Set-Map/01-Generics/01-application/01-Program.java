package application;

/**
 * Generics em Java.
 * Autor: Bernardo
 * Data: Fevereiro de 2026
 */

import java.util.Scanner;
import services.PrintService;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PrintService<String> ps = new PrintService<>();
        
        System.out.print("How many values? ");
        int n = sc.nextInt();
            
            //type safety não permite adicionar variaveis diferentes de Integer
            //ps.addValue("Maria");
        
        for (int i = 0; i < n; i++){
            String value = sc.next();
            ps.addValue(value);
        }
        
        ps.print();
        String x = ps.first();
        System.out.println("First: " + x);
        
        sc.close();
    }
}
