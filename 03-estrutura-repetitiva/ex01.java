package com.mycompany.exerc_while;
/**
 * Exercícios de estrutura repetitiva(while) em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
import java.util.Scanner;

public class Exerc_while {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("########Leitor de senha########");
        leitorSenha(sc);
        System.out.println();

        System.out.println("########Leitor de coordenadas do plano cartesiano########");
        lerCoordenadas(sc);
        System.out.println();
        
        System.out.println("########Ler o tipo de combustível abastecido########");
        lerCombustivel(sc);
        System.out.println();
        
        sc.close();
    }
    
    public static void leitorSenha(Scanner sc){
        System.out.print("Digite sua senha de quatro dígitos: ");
        int senha = sc.nextInt();
        
        // Enquanto senha não for igual a 2002 continua rodando
        while(senha != 2002){
            System.out.println("Senha Inválida");
            
            System.out.print("Digite sua senha de quatro dígitos: ");
            senha = sc.nextInt();
        } 
        
        System.out.println("Acesso Permitido");
    } 
    
    public static void lerCoordenadas (Scanner sc){

        System.out.print("X: ");  
        int x = sc.nextInt();
        System.out.print("Y: ");
        int y = sc.nextInt();

        // Enquanto nenhum dos valores for zero, continua executando
        while(x != 0 && y !=0 ){
            
            if(x > 0 && y > 0){
                System.out.println("Primeiro quadrante"); 
            }
            else if(x < 0 && y > 0){
                System.out.println("Segundo quadrante"); 
            }
            else if(x < 0 && y <0){
                System.out.println("Terceiro quadrante"); 
            }
            else{
                System.out.println("Quarto quadrante"); 
            }
            
            // Lê novas coordenadas
            System.out.print("X: "); 
            x = sc.nextInt();
            System.out.print("y: ");
            y = sc.nextInt();

        }
    }
    
    public static void lerCombustivel(Scanner sc){
        
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        System.out.print("Digite o codigo do combustivel(De 1 a 3) para registra-lo ou digite 4 para encerrar: ");
        int num = sc.nextInt();
        
        // Enquanto num não for igual a 4 continua rodando
        while(num != 4){
            if(num == 1){
                alcool += 1;
            }
            else if(num == 2){
                gasolina += 1;
            }
            else if(num == 3){
                diesel += 1;
            }
            System.out.print("Digite o codigo do combustivel(De 1 a 3) para registra-lo ou digite 4 para encerrar: ");
            num = sc.nextInt();
        }
        
        System.out.println("Muito obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
