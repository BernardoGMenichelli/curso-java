package com.mycompany.funcstring;
/**
 * Funções para String em Java.
 * Autor: Bernardo
 * Data: Junho de 2025
 */

public class FuncString {

    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG   "; 
        
        //converte a String em letra minusculas
        String s01 = original.toLowerCase();
        //converte a String em letras maiusculas
        String s02 = original.toUpperCase();
        //remove espaços no canto da string
        String s03 = original.trim();
        
        //String começa a partir do segundo caractere (considerando 0)
        String s04 = original.substring(2);
        //determina a partir de qual caractere a String começa e termina(considerando 0)
        String s05 = original.substring(2, 9);
        
        //substitui um caractere por outro
        String s06 = original.replace('a', 'x');
        //substitui uma palavra por outra
        String s07 = original.replace("abc", "xy");
        
        //pesquisa a primeira ocorrencia do valor
        int i = original.indexOf("bc");
        //pesquisa a ultima ocorrencia do valor
        int j = original.lastIndexOf("bc");
        

        String s = "potato apple lemon";
        //separa e joga a String em um vetor(a logica para separar as palavras fica dentro do "()")
        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
        
        
        
        System.out.println("Original: " + "-" + original + "-");
        System.out.println();
      
        System.out.println("########Formatar########");
        System.out.println("toLowerCase: " + "-" + s01 + "-");
        System.out.println("toUpperCase: " + "-" + s02 + "-");
        System.out.println("trim: " + "-" + s03 + "-");
        System.out.println();
        
        System.out.println("########Recortar########");
        System.out.println("substring(2): " + "-" + s04 + "-");
        System.out.println("substring(2, 9): " + "-" + s05 + "-");
        System.out.println();
        
        System.out.println("########Substituir########");
        System.out.println("replace('a', 'x'): " + "-" + s06 + "-");
        System.out.println("replace(\"abc\", \"xy\"): " + "-" + s07 + "-");
        System.out.println();
        
        System.out.println("########Buscar########");
        System.out.println("indexOf(\"bc\"): " + i);
        System.out.println("lastIndexOf(\"bc\"): " + j);
        System.out.println();
        
        System.out.println("########Criar vetor com a String########");
        System.out.println("Palavra 1: " + vect[0]);
        System.out.println("Palavra 2: " + vect[1]);
        System.out.println("Palavra 3: " + vect[2]);
    }
}
