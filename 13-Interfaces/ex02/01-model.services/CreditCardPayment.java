package model.services;

public class CreditCardPayment implements Payment, OnlinePayment {

    public static final double FEE_PERCENTAGE = 0.03;

    @Override
    public double paymentFee(double amount) {
        return amount * FEE_PERCENTAGE;
    }

    @Override
    public double processPayment(double amount) {
        return amount + paymentFee(amount);
    }

}
