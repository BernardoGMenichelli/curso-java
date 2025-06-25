package com.mycompany.exerc_for;
/**
 * Exercícios de estrutura repetitiva(for) em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */
import java.util.Scanner;
import java.util.Locale;

public class Exerc_for {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("########Leitor de numeros impares########");
        numeroImpar(sc);
        System.out.println();
        
        System.out.println("########Intervalo de numeros entre 10-20########");
        intervaloNumeros(sc);
        System.out.println();

        System.out.println("########Calcula a media ponderada########");
        mediaPonderada(sc);
        System.out.println();

        System.out.println("########Calcula uma divisão simples########");
        calculoDivisao(sc);
        System.out.println();

        System.out.println("########Calcula o fatorial de um numero########");
        calculoFatorial(sc);
        System.out.println();

        System.out.println("########Calcula os divisores de um numero########");
        calculoDivisores(sc);
        System.out.println();

        System.out.println("########Mostra o número da linha, depois o quadrado e o cubo do valor########");
        numeroLinha(sc);
        System.out.println();
        
        sc.close();
    }
    
    public static void numeroImpar(Scanner sc){
        System.out.print("Digite um numero inteiro de 1 a 1000: ");
        int x = sc.nextInt();

        if(x<1000 || x>1){
            for (int i = 1; i <= x; i++){
                if(i % 2 !=0){
                    System.out.println(i);
                }
        }
            }
        else{
            System.out.println("Valor Inválido");  
        }

    }
    
    public static void intervaloNumeros (Scanner sc){
        System.out.print("Digite a quantidade de numeros que serão inseridos: ");
        int N = sc.nextInt();
        
        int in = 0;
        int out = 0;
        
        for(int i = 0;i < N;i++){
            System.out.print("Digite um numero inteiro: ");
            int x = sc.nextInt();
            if(x>=10 && x<=20){
                in += 1;
            }
            else{
                out += 1;
            }
        } 
        
        System.out.println();
        System.out.println(in + " in");
        System.out.println(out + " out");
    
    }
    
    public static void mediaPonderada(Scanner sc){
        double media,a,b,c;
        System.out.print("Digite a quantidade de medias a serem caluladas: ");
        int N = sc.nextInt();

        //(MP) = (v1 \* p1 + v2 \* p2 + ... + vn \* pn) / (p1 + p2 + ... + pn)
        for(int i=1; i<=N; i++){
            System.out.print("Digite as tres notas: ");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            
            media=(a*2+b*3+c*5)/(2+3+5);
            
            System.out.printf("Media " + i + " = %.1f%n%n",media);
            System.out.println();
        }
        
    }
    
    public static void calculoDivisao(Scanner sc){
        System.out.print("Digite a quantidade de divisoes a serem calculadas: ");
        int N = sc.nextInt();
        
        for(int i=1;i<=N;i++){
            System.out.print("Digite os valores de A e B: ");
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            if(B!=0){
                double divisao = (double)A/B;
                System.out.printf("Divisão " + i + " = %.1f%n%n",divisao);
            }
            else{
                System.out.println("Divisao impossivel");
                System.out.println();
            }

            
        }
    }
    
    public static void calculoFatorial(Scanner sc){
        System.out.print("Digite um numero inteiro: ");
        int N = sc.nextInt();
        
        int fat = 1;
        
        //N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        for(int i = 1 ;i<=N ;i++){
            fat *= i;
            //4*1 4*2 8*3 = 24
        }
		
        System.out.println("Fatorial de " + N + " = " + fat);
    }
    
    public static void calculoDivisores(Scanner sc){
        System.out.print("Digite um numero inteiro: ");
        int N = sc.nextInt();
        
        for(int i = 1;i<=N; i++){
            if(N %i == 0){
            System.out.println(i);
            }
        }
    }
    
    public static void numeroLinha (Scanner sc){
        System.out.print("Digite um numero inteiro: ");
        int N = sc.nextInt();
        
        for(int i = 1;i<=N; i++){
            int a,b,c;
            a= i;
            b= i*i;
            c=i*i*i;
            
            System.out.printf("%d %d %d%n",a,b,c);
        }
    }
    
}
