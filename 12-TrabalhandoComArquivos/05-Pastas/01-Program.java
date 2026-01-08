package com.mycompany.pastas;

/**
 * Trabalhando com pastas em Java.
 * Autor: Bernardo
 * Data: Novembro de 2025
 */

import java.io.File;
import java.util.Scanner;

public class Pastas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);

        //le o nome das pastas
        System.out.println();
        System.out.println("Folders:");
        for (File folder : folders) {
            System.out.println(folder);
        }
        
        //le o nome dos arquivos
        System.out.println();
        System.out.println("Files:");
        File[] files = path.listFiles(File::isFile);
        for (File file : files) {
            System.out.println(file);
        }
        
        //cria pastas
        boolean success = new File(strPath + "\\subdir1").mkdir();
        System.out.println();
        System.out.println("Directory created succefully: " + success);

        sc.close();
    }
}
