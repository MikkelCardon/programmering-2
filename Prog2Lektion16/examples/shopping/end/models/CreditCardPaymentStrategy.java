package examples.shopping.end.models;

public class CreditCardPaymentStrategy extends PaymentStrategy{
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using credit card.");
    }
}
