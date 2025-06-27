package util;

public class Calculator {
    //o "final" indica que é uma constante e não uma variavel
    //padrão para constantes é a palavra, ou palavras, inteira em letra maiuscula
    public static final double PI = 3.14159;
    
    public static double circunference(double radius){
        return 2.0 * PI * radius;
    }
    
    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
    
}
