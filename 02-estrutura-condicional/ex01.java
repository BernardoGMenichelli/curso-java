package com.mycompany.exerc_condicional;

import java.util.Scanner;
import java.util.Locale;
/**
 * Exercícios de estrutura condicional em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
public class Exerc_condicional {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("########Calcular se um número é positivo ou negativo########");
        numeroInteiro(sc);
        System.out.println();
        
        System.out.println("########Calcular se um número é par ou impar########");
        numeroParImpar(sc);
        System.out.println();
       
        System.out.println("########Calcular se dois números são multiplos########");
        numeroMultiplo(sc);
        System.out.println();
        
        System.out.println("########Calcular o horário de um jogo########");
        horaJogo(sc);
        System.out.println();
        
        System.out.println("########Calcular tabela########");
        calculoTabela(sc);
        System.out.println();
        
        System.out.println("########Calcular intervalo########");
        calculoIntervalo(sc);
        System.out.println();
 
        System.out.println("########Calcular coordenadas########");
        eixoXY(sc);
        System.out.println();
 
        System.out.println("########Calcular imposto de renda########");
        impostoDeRenda(sc);        
        sc.close();
    }
    public static void numeroInteiro(Scanner sc){
        System.out.print("Digite um número inteiro: ");
        int x = sc.nextInt();
        
        if(x>=0){
            System.out.println("Seu número é positivo");
        }
        
        else{
            System.out.println("Seu número é negativo");
        }
    }
    
    public static void numeroParImpar(Scanner sc){
        System.out.print("Digite um número inteiro: ");
        int y = sc.nextInt();

        if(y % 2 == 0){
            System.out.println("Seu número é par");
        }
    
        else{
            System.out.println("Seu número é impar");
        }
    }
    
    public static void numeroMultiplo(Scanner sc){
        System.out.print("Digite o primeiro valor inteiro: ");
        int A = sc.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        int B = sc.nextInt();
        
        if(A % B == 0 || B % A == 0){
            System.out.print("São múltiplos");    
        }
        else{
            System.out.print("Não são múltiplos");
        }
    }
    
    public static void horaJogo(Scanner sc){
        System.out.print("Digite o horário de inicio do jogo: ");
        int hora1 = sc.nextInt();
        System.out.print("Digite o horário de termino do jogo: ");
        int hora2 = sc.nextInt();
        
        int tempo;
        if(hora1<hora2){
            tempo = hora2-hora1;// 10 - 2 = 8 horas
        }
        else{
            tempo = 24 - hora1 + hora2 ;// 24 - 16 + 10 = 18 horas
        }
        
        System.out.println("O jogo durou: " + (tempo) + " horas");
    }
    
    public static void calculoTabela(Scanner sc){

        System.out.print("Digite o código do produto(de 1 á 5): ");
        int codigo = sc.nextInt();
        System.out.print("Digite a quantidade desejada: ");
        int quantidade = sc.nextInt();
        
        double total;
        if(codigo == 1){ 
            total = quantidade*4.0; //cachorro quente
        }
        else if(codigo == 2){ 
            total = quantidade*4.5; //x-Salada
        }
        else if(codigo == 3){
            total = quantidade*5.0; //x-Bacon
        }
        else if(codigo == 4){
            total = quantidade*2.0; //Torrada simples
        }
        else {
            total = quantidade*1.5; //Refrigerante
        }

        System.out.printf("Total: R$ %.2f ", total);
        
    }
    
    public static void calculoIntervalo(Scanner sc){
        System.out.print("Digite um valor entre 0 e 100: ");
        double valor = sc.nextDouble();
        
		if (valor < 0.0 || valor > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (valor <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (valor <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (valor <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}		
		else {
			System.out.println("Intervalo (75,100]");
		}
    }
    
    public static void  eixoXY(Scanner sc){
        System.out.print("Número do eixo X: ");
        double X = sc.nextDouble();
        System.out.print("Número do eixo Y: ");       
        double Y = sc.nextDouble();
        
        if(X==0 && Y==0){
            System.out.print("Origem");
        }
        else if(X==0.0){
            System.out.print("Eixo Y");
        }
        else if(Y==0.0){
            System.out.print("Eixo X");
        }
        else if(X>0.0 && Y>0.0){
            System.out.print("Q1");
        }
        else if(X<0.0 && Y>0.0){
            System.out.print("Q2");
        }
        else if(X<0.0 && Y<0.0){
            System.out.print("Q3"); 
        }
        else{
            System.out.print("Q4"); 
        }
        
    }
    
    public static void impostoDeRenda(Scanner sc){
        System.out.print("Salario: ");
        double salario = sc.nextDouble();
        
        double imposto;
        /*
        4520
        R$2000.00: isento
        De R$2000.01 a R$3000.00 → 1000.00 * 8% = 80.00
        De R$3000.01 a R$4500.00 → 1500.00 * 18% = 270.00
        Acima de R$4500.00 → 20.00 * 28% = 5.60
        */
       
        if(salario<=2000.00){
            imposto = 0;
        }
        else if(salario>2000.00 && salario<=3000.00){
            imposto = 0.08*(salario-2000.0);

        }
        else if(salario>3000.00 && salario<=4500.00){
            imposto = (1000*0.08) + (0.18*(salario-3000.0));

        }
        else{
            imposto = (1000.00*0.08) + (0.18*1500.00) + (0.28*(salario-4500));

        }
        
        if (imposto==0){
            System.out.println("Isento ");            
        }
        else{
            System.out.printf("R$ %.2f",imposto);
        }
    }
}
