package examples.shopping.start.models;

public class Item {
    private double price;
    private String name;

    public Item(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }


    public String getName() {
        return name;
    }

}
