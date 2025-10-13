package com.mycompany.metodoabstrato;

/**
 * Metodo abstrata em Java. 
 * Autor: Bernardo 
 * Data: Outubro de 2025
 */

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MetodoAbstrato {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Shape> list = new ArrayList<>();
        
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + " data:");
            System.out.print("Retangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {

                System.out.print("Width: ");
                double w = sc.nextDouble();
                System.out.print("Height: ");
                double h = sc.nextDouble();

                list.add(new Rectangle(color, w, h));
            }
            else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                
                list.add(new Circle(color, radius));
            }
        }
        System.out.println();
        System.out.println("Shape Areas:");
        for(Shape shape : list){
            System.out.println(String.format("%.2f", shape.area()));  
        }
        
    }
}
