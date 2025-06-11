package com.mycompany.fixacaofinal;

import java.util.Scanner;
import java.util.Locale;

public class Fixacaofinal {

    public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    somaSimples(sc);
    areaDoCirculo(sc);
    diferencaProduto(sc);
    salarioFuncionario(sc);
    valorTotalPecas(sc);
    calculosGeometricos(sc);
    
    sc.close();

    }

    public static void somaSimples(Scanner sc){
        System.out.print("Digite o primeiro número da soma: ");
        int x = sc.nextInt();
        System.out.print("Digite o segundo número da soma: ");
        int y = sc.nextInt();

        System.out.println("A soma de " + x + " com " + y + " é igual a " + (x+y));
        System.out.println();
    }
    
    public static void areaDoCirculo(Scanner sc){
        double pi = 3.14159;
        System.out.print("Insira o valor do raio: ");
        double raio = sc.nextDouble();

        System.out.printf("A = %.4f",pi*(raio*raio)); //A=π*r²
    }
    
    public static void diferencaProduto(Scanner sc){
        System.out.print("\n\nInsira o valor de A: ");
        int A = sc.nextInt();
        System.out.print("Insira o valor de B: ");    
        int B = sc.nextInt();
        System.out.print("Insira o valor de C: ");   
        int C = sc.nextInt();
        System.out.print("Insira o valor de D: ");
        int D = sc.nextInt();

        System.out.println("Diferenca = " + (A * B - C * D));
        System.out.println();
    }
    
    public static void salarioFuncionario(Scanner sc){
        System.out.print("Insira o número do funcionário: ");
        int numero = sc.nextInt();
        System.out.print("Insira o número de horas trabalhadas: ");
        int hora = sc.nextInt();
        System.out.print("Insira o valor que recebe por hora: ");
        double salario = sc.nextDouble();

        System.out.println("Número = " + numero);
        System.out.println("Salário = R$ " + hora*salario);
        System.out.println();
    }  
    
    public static void valorTotalPecas(Scanner sc){
        System.out.print("Código de peça 1: ");
        int cod1 = sc.nextInt();
        System.out.print("Número de peças 1: ");
        int num1 = sc.nextInt();
        System.out.print("Valor unitário de peça 1: ");
        double valor1 = sc.nextDouble();

        System.out.print("Código de peça 2: ");
        int cod2 = sc.nextInt();
        System.out.print("Número de peças 2: ");
        int num2 = sc.nextInt();
        System.out.print("Valor unitário de peça 2: ");
        double valor2 = sc.nextDouble();    

        System.out.println("Codigo das peças: " + cod1 + " e " + cod2);
        System.out.printf("Valor a pagar: R$ %.2f",(num1*valor1+num2*valor2));
        System.out.println();
        System.out.println();
}
    
    public static void calculosGeometricos(Scanner sc){
        System.out.print("Digite o primeiro valor: ");
        double E = sc.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double F = sc.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        double G = sc.nextDouble();

        System.out.printf("Triangulo = %.3f%n", (E*G/2)); //A=a*h/2
        System.out.printf("Circulo = %.3f%n", (3.14159*(G*G)));//A=π*r²
        System.out.printf("Trapezio = %.3f%n", ((E+F)*G)/2);//A=(B+b).h/2
        System.out.printf("Quadrado = %.3f%n", F*F); //A=I²
        System.out.printf("Retangulo = %.3f%n", E*F); //A=b*h
}
}
