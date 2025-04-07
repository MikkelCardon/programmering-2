package examples.shopping.start;

import examples.shopping.start.models.Item;
import examples.shopping.start.models.PaymentMethod;
import examples.shopping.start.models.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(10.0, "Sukker");
        Item item2 = new Item(20.0, "Brød");
        Item item3 = new Item(30.0, "Mælk");

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        cart.pay(PaymentMethod.CASH);
    }
}
