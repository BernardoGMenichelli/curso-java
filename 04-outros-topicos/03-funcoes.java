package com.mycompany.criarfuncoes;
/**
 * Funções em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
import java.util.Scanner;

public class CriarFuncoes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int higher = max(a,b,c);
        showResult(higher);
        sc.close();
    }
    
    //retorna um valor int
    public static int max(int x, int y, int z){
        int aux;
        if(x > y && x > z){
            aux = x;
        }
        else if(y > z){
            aux = y;
        }
        else{
            aux = z;
        }
        //indica que a funçao vai retornar um valor
        return aux;
    }
    
    //não retorna nenhum valor para ser reaproveitado
    public static void showResult(int value){
        System.out.println("Higher = " + value); 
    }

}
