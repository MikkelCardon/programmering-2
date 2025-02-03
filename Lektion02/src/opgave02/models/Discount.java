package opgave02.models;

import java.util.ArrayList;

public abstract class Discount {
    private final String description;


    public Discount( String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double applyDiscount(double amount, ArrayList<Book> items);
}
