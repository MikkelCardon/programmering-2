package opgave02.models;

public class BarTabItem {
    private Order order;
    private int subTotal;

    public BarTabItem(Order order, int subTotal) {
        this.order = order;
        this.subTotal = subTotal;
    }

    public Order getOrder() {
        return order;
    }

    public int getSubTotal() {
        return subTotal;
    }
}
