package application;

/**
 * HashCode e Equals em Java.
 * Autor: Bernardo
 * Data: Março de 2026
 */

import model.entities.Person;

public class Program {

    public static void main(String[] args) {
        String a = "Maria";
        String b = "Alex";
        String c = "Alex";
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        
        /*Since hashCode and equals are not overridden in the Person class, 
        the equals method compares objects using their respective memory references (pointers)*/
        Person x = new Person("Heloisa");
        Person z = new Person("Heloisa");
        System.out.println(x.equals(z));
        
        //if two data items have the same content, the same code is generated.
        String d = "Maria";
        String e = "Maria";
        String f = "Alex";
        System.out.println(d.hashCode());
        System.out.println(e.hashCode());
        System.out.println(f.hashCode());
    }
}
