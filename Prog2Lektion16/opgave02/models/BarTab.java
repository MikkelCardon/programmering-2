package opgave02.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BarTab {
    private List<BarTabItem> items = new ArrayList<>();

    public void addItem(BarTabItem item) {
        items.add(item);
    }

    public void Print() {
        System.out.println("-------- Basement --------");
        for (BarTabItem item : items) {
            System.out.println(item.getOrder().getCount() + "x " + item.getOrder().getProduct().getName() + " " + item.getSubTotal());
        }
        System.out.println();
        System.out.println("Total: " + getTotal());

    }

    private int getTotal() {
        int total = 0;
        for (BarTabItem item : items) {
            total += item.getSubTotal();
        }
        return total;
    }
}
