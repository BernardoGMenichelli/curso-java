package com.mycompany.lendotxt;

/**
 * Lendo arquivos de texto em Java.
 * Autor: Bernardo
 * Data: Novembro de 2025
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LendoTxt {

    public static void main(String[] args) {
        File file = new File("c:\\temp\\in.txt");
        Scanner sc = null;
        //na hora de abrir o arquivo pode ocorrer uma exceção
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally { 
            /*  -boa pratica, colocar o fechamento do recurso no bloco finally
                -se houver um erro na instanciação do sc ele vale nulo,
                fazendo com que ao fechar crie uma exceção(por isso do if)
            */
            if (sc != null) {
                sc.close();
            }
        }
    }
}
