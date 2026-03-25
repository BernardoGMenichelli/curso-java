package application;

/**
 * Get/put de coringa delimitados em Java.
 * Autor: Bernardo
 * Data: Março de 2026
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<String> myStrings = Arrays.asList("Heloisa", "Bernardo", "Danilo");
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts, myObjs);
        printList(myObjs);
        myObjs.clear();

        copy(myDoubles, myObjs);
        printList(myObjs);
        myObjs.clear();

        copy(myStrings, myObjs);
        printList(myObjs);
        myObjs.clear();
    }

    public static <T> void copy(List<? extends T> source, List<? super T> destination) {
        for (T src : source) {
            destination.add(src);
        }
    }

    public static void printList(List<?> list) {
        System.out.print("[");
        for (Object obj : list) {

            System.out.print(obj + " ");
        }
        System.out.print("]");
        System.out.println();
    }
}
