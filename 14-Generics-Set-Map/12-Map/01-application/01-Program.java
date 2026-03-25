package application;

/**
 * Map em Java.
 * Autor: Bernardo
 * Data: Março de 2026
 */

import java.util.Map;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();
        
        cookies.put("UserName", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99701122");
        
        //overwrites the previous value
        cookies.put("phone", "99701133");
        
        cookies.remove("email");
            
        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        //non-existent = null
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());
        
        System.out.println();
        System.out.println("All Cookies:");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
        System.out.println();
        System.out.println("All Values:");
        for (String value : cookies.values()) {
            System.out.println(value);
        }
    }
}
