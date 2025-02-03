package opgave02.models.discounts;

import opgave02.models.Book;
import opgave02.models.Discount;

import java.util.ArrayList;

public class FixedDiscount extends Discount {
    private int discount;
    private int minimumAmount;

    public FixedDiscount(String description, int discount, int minimumAmount) {
        super(description);
        this.discount = discount;
        this.minimumAmount = minimumAmount;
    }

    @Override
    public double applyDiscount(double amount, ArrayList<Book> items){
        if (amount >= minimumAmount){
            return discount;
        }
        return 0;
    }

}
