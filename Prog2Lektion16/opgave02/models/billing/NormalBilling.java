package opgave02.models.billing;

import opgave02.models.Order;

public class NormalBilling implements BillingType {

    @Override
    public int price(Order order) {
        return order.getTotalPrice();
    }
}
