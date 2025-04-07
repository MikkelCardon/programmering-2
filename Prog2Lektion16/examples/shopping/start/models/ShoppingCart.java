package examples.shopping.start.models;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double getTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void pay(PaymentMethod paymentMethod) {
        double total = getTotal();
        switch (paymentMethod) {
            case CASH:
                System.out.println("Paying " + total + " with cash.");
                break;
            case CREDIT_CARD:
                System.out.println("Paying " + total + " with credit card.");
                break;
            case MOBILEPAY:
                System.out.println("Paying " + total + " with mobile pay.");
                break;
            default:
                System.out.println("Unknown payment method.");
        }
    }
}
