package application;

/**
 * Interface em Java.
 * Autor: Bernardo
 * Data: Janeiro de 2026
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data:");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("withdrawal(dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Return (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
        
        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
        
        System.out.print("Enter the price per hour: ");
        Double pricePerHour = sc.nextDouble();
        System.out.print("Enter the price per day: ");
        Double pricePerDay = sc.nextDouble();
        
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        
        rentalService.processInvoice(cr);
        
        System.out.println();
        System.out.println("Invoice:");
        System.out.println("Basic payment: " + String.format("%.2f",cr.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f",cr.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f",cr.getInvoice().totalPayment()));
        
        sc.close();
    }
}
