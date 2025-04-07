package opgave02.models.billing;

import opgave02.models.Order;

public interface BillingType {
    int price(Order order);
}
