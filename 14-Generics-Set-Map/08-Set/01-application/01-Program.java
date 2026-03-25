package application;

/**
 * Set em Java.
 * Autor: Bernardo
 * Data: Março de 2026
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new LinkedHashSet<>();

        //HashSet does not guarantee any ordering of its elements
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        //TreeSet guarantees the ordering of its elements
        set1.add("Tv");
        set1.add("Tablet");
        set1.add("Notebook");

        //LinkedHashSet guarantees insertion ordering of its elements
        set2.add("Tv");
        set2.add("Tablet");
        set2.add("Notebook");

        System.out.println("########HashSet########");
        print(set);
        System.out.println("########Hash removed########");
        set.removeIf(x -> x.length() >= 3);
        print(set);

        System.out.println();
        System.out.println("########TreeSet########");
        print(set1);

        System.out.println();
        System.out.println("########LinkedHashSet########");
        print(set2);
    }

    public static <T> void print(Set<T> set) {
        for (T p : set) {
            System.out.println(p);
        }
    }
}
