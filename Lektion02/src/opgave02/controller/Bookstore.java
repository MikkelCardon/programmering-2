package opgave02.controller;


import opgave02.models.Basket;
import opgave02.models.Book;
import opgave02.models.Discount;
import opgave02.models.DiscountType;
import opgave02.models.discounts.FixedDiscount;
import opgave02.models.discounts.ProcentDiscount;

public class Bookstore {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addItem(new Book(600, "Introduction to Java Programming and Data Structures"));
        basket.addItem(new Book(350, "Head First Design Patterns"));
        basket.addDiscount(new ProcentDiscount("10% rabat på alt", 10));
        basket.addDiscount(new FixedDiscount("25 kr rabat på beløb over 500 kr.", -25, 500));
        basket.addDiscount(new FixedDiscount("50 kr rabat på beløb over 1000 kr.", -50,1000));
        basket.printTotal();

    }
}
