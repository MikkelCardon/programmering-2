package opgave02.models.discounts;

import opgave02.models.Book;
import opgave02.models.Discount;

import java.util.ArrayList;

public class ProcentDiscount extends Discount {
    private int procent;

    public ProcentDiscount(String description, int procent) {
        super(description);
        this.procent = procent;
    }

    public int getProcent() {
        return procent;
    }

    @Override
    public double applyDiscount(double amount, ArrayList<Book> items){
        return ((procent/100.0) * amount)*-1;
    }
}
