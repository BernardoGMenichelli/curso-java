package util;

public class CurrencyConverter {
    
    public static final double TAX = 0.06; 
    
    public static double taxCalculate(double price, double dollar){
        return dollar * price * (1.0+TAX);
    }
    
}
