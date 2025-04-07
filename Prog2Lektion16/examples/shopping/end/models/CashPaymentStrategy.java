package examples.shopping.end.models;

public class CashPaymentStrategy extends PaymentStrategy {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using cash.");
    }
}
