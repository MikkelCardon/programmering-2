package opgave02.models.billing;

import opgave02.models.Order;

public class StudentBilling implements BillingType{

    @Override
    public int price(Order order) {
        return (int) (order.getTotalPrice() * 0.9);
    }
}
