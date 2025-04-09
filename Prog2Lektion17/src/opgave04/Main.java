package opgave04;

import opgave04.models.Book;
import opgave04.models.Buyer;
import opgave04.models.Customer;
import opgave04.models.Salesman;

public class Main {
    public static void main(String[] args) {
        // TODO: create a salesman and a purchaser
        Salesman salesman = new Salesman("Henning");

        Buyer buyer = new Buyer("Hans");

        Book donaldDuck = new Book("Donald Duck");
        // TODO: add observers
        donaldDuck.addObserver(buyer);
        donaldDuck.addObserver(salesman);

        // TODO: make purchaser buy 6 copies of donaldDuck
        buyer.buyBook(donaldDuck, 6);
        System.out.println();


        Book java = new Book("Java");
        // TODO: add observers
        java.addObserver(buyer);
        java.addObserver(salesman);

        // TODO: make purchaser buy 8 copies of java
        buyer.buyBook(java, 8);
        System.out.println();


        Book designPatterns = new Book("Design Patterns");
        // TODO: add observers
        designPatterns.addObserver(buyer);
        designPatterns.addObserver(salesman);

        // TODO: make purchaser buy 10 copies of designPatterns
        buyer.buyBook(designPatterns, 10);
        System.out.println();

        Customer bob = new Customer("Bob");
        Customer alice = new Customer("Alice");
        Customer harry = new Customer("Harry");

        //---------------------------------------------------------------------

        makeSale(donaldDuck, bob);
        System.out.println();
        makeSale(donaldDuck, alice);
        System.out.println();
        makeSale(donaldDuck, harry);
        System.out.println();

        makeSale(java, bob);
        System.out.println();
        makeSale(java, alice);
        System.out.println();
        makeSale(java, harry);
        System.out.println();

        makeSale(designPatterns, bob);
        System.out.println();

        // TODO: print each customer and his/her books
        System.out.println(bob.getBoughtBooks());
        System.out.println(alice.getBoughtBooks());
        System.out.println(harry.getBoughtBooks());
    }

    public static void makeSale(Book book, Customer customer) {
        System.out.println("Sale: " + book + " sold to " + customer.getName());
        // TODO: link customer and book
        customer.addBook(book);
        book.addCustomer(customer);
        book.decCount(1);
    }

}
