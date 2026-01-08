package com.mycompany.classeswriter;

/**
 * Classes Writer em Java.
 * Autor: Bernardo
 * Data: Novembro de 2025
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ClassesWriter {

    public static void main(String[] args) {
        String[] lines = new String[]{"Good MorningE", "Good AfternoonE", "Good NightE"};

        String path = "c:\\temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
