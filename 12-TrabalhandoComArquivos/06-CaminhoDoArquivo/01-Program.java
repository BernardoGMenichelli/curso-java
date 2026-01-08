package com.mycompany.caminhoarquivo;

/**
 * Caminho do arquivo em Java.
 * Autor: Bernardo
 * Data: Novembro de 2025
 */

import java.io.File;
import java.util.Scanner;

public class CaminhoArquivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        //pega o nome do arquivo
        System.out.println("Get name: " + path.getName());
        //pega o caminho até o arquivo
        System.out.println("Get parent: " + path.getParent());
        //pega o caminho todo
        System.out.println("Get path: " + path.getPath());

        sc.close();
    }
}
