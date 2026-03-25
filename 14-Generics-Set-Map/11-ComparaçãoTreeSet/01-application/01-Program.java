package application;

/**
 * Como TreeSet compara elementos em Java.
 * Autor: Bernardo
 * Data: Março de 2026
 */

import java.util.Set;
import java.util.TreeSet;
import model.entities.Product;

public class Program {

    public static void main(String[] args) {
        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        for (Product p : set) {
            System.out.println(p);
        }
    }
}
