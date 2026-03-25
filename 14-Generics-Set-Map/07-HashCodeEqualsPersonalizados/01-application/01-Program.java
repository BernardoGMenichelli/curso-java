package application;

/**
 * HashCode e Equals personalizados em Java. 
 * Autor: Bernardo 
 * Data: Março de 2026
 */

import model.entities.Client;

public class Program {

    public static void main(String[] args) {
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");
        Client c3 = c1;

        String s1 = "test";
        String s2 = "test";
        String s3 = new String("test");
        String s4 = new String("test");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        //analyzes memory references, not the content
        System.out.println(c1 == c2);
        System.out.println(c3 == c1);

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);

    }
}
