package opgave02.models.discounts;

import opgave02.models.Book;
import opgave02.models.BookType;

import java.util.ArrayList;

public class EbøgerProcent extends ProcentDiscount{
    public EbøgerProcent(String description, int procent) {
        super(description, procent);
    }

    public double applyDiscount(double amount, ArrayList<Book> items){
        double totalDiscount = 0;
        for (Book item : items) {
            if (item.getBookType().equals(BookType.EBOOK)){
                totalDiscount += item.getPrice();
            }
        }
        return (totalDiscount * super.getProcent()/100.0) *-1;
    }
}
