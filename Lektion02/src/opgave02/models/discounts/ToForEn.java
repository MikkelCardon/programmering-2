package opgave02.models.discounts;

import opgave02.models.Book;
import opgave02.models.Discount;

import java.util.ArrayList;

public class ToForEn extends Discount {
    public ToForEn(String description) {
        super(description);
    }

    public double applyDiscount(double amount, ArrayList<Book> items){
        if (items.size() <= 1) return 0;

        int amountOfFreeBooks = items.size() % 2;

        items.sort(Book::compareTo);

        double totalDiscount = 0;
        for (int i = 0; i < amountOfFreeBooks; i++) {
            totalDiscount -= items.get(i).getPrice();
        }
        return totalDiscount;
    }
}
