package opgave04.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Salesman implements Observer{
    private final String name; // not empty

    public Salesman(String name) {
        this.name = name;
    }

    @Override
    public void update(Book book) {
        Set<Book> books = new HashSet<>();
        for (Customer customer : book.getBougtBy()) {
            books.addAll(customer.getBoughtBooks());
        }
        books.remove(book);
    }
}
