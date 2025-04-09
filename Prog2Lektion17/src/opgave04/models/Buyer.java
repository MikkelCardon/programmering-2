package opgave04.models;

public class Buyer implements Observer{
    private final String name;// not empty

    public Buyer(String name) {
        this.name = name;
    }

    public void buyBook(Book book, int amount) {
        book.incCount(amount);
        System.out.println("Buyer " + name + ": " + book + ", " + book.getCount() + " copies");
    }

    @Override
    public void update(Book book) {
        if(book.getCount() <= 5){
           buyBook(book, 10);
        }
    }
}
