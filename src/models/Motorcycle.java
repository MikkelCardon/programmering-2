package models;

public class Motorcycle extends Vehicle{
    public Motorcycle(Brand brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    void startEngine() {
        System.out.println("VROOM NENENENNE");
    }
}
