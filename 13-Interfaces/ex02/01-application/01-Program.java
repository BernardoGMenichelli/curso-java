package application;

import model.services.CreditCardPayment;
import model.services.DebitCardPayment;
import model.services.Payment;
import model.services.PixPayment;

public class Program {

    public static void main(String[] args) {
        Payment credit = new CreditCardPayment();
        Payment debit = new DebitCardPayment();
        Payment pix = new PixPayment();

        double value1 = credit.processPayment(200);
        double value2 = debit.processPayment(200);
        double value3 = pix.processPayment(200);

        System.out.printf("Credit Card: %.2f%n", value1);
        System.out.printf("Debit Card: %.2f%n", value2);
        System.out.printf("Pix: %.2f%n", value3);

    }
}
