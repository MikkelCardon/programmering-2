package opgave02.models;

public class Book implements Comparable<Book>{
    private final double price;
    private final String title;
    private BookType bookType = BookType.BOOK;

    public Book(double price, String title) {
        this.price = price;
        this.title = title;
    }
    public Book(double price, String title, BookType bookType) {
        this.price = price;
        this.title = title;
        this.bookType = bookType;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public BookType getBookType() {
        return bookType;
    }

    @Override
    public int compareTo(Book other){
        return Double.compare(this.price, other.price);
    }
}
