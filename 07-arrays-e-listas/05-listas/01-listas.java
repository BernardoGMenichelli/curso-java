package com.mycompany.lista;

/**
 * Listas em Java.
 * Autor: Bernardo
 * Data: Julho de 2025
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

    public static void main(String[] args) {
        //a lista não aceito tipos primitivos
        //ArrayList é uma classe que implementa a interface list
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Andrea");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("------------------------------");
        //remove pela posição
        list.remove(1);
        //remove por um predicado
        list.removeIf(x -> x.charAt(0) == 'M'); // função lambda
        
        for (String x : list) {
            System.out.println(x);
        }
        
        System.out.println("------------------------------");
        //usado para encontrar posição de elemento
        System.out.println("Indef of Bob: " + list.indexOf("Bob"));
        System.out.println("Indef of Marco: " + list.indexOf("Marco"));
        
        System.out.println("------------------------------");
        //.stream é um tipo especial que aceita operações com expressões lambda
        //.stream não é compativel com list, então o .collect converte ele para lista novamente
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        
        for (String x : result) {
            System.out.println(x);
        }
        
        System.out.println("------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
