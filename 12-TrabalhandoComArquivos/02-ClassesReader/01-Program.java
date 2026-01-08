package com.mycompany.classesreader;

/**
 * Classes reader em Java.
 * Autor: Bernardo
 * Data: Novembro de 2025
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ClassesReader {

    public static void main(String[] args) {

        String path = "c:\\temp\\out.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            //BufferedReader é instanciado a partir do FileReader(abstração maior)
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
