package opgave02.models;

import opgave02.models.billing.BillingType;
import opgave02.models.products.Beer;

public class Customer {
    private BarTab tab;

    public Customer() {
        this.tab = new BarTab();
    }

    public void placeOrder(Order order, BillingType billingType) {
        tab.addItem(new BarTabItem(order, billingType.price(order)));
    }

    public BarTab getBarTab() {
        return tab;
    }
}
