package models;

public abstract class Vehicle {
    private Brand brand;
    private String model;
    private int year;

    public Vehicle(Brand brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    abstract void startEngine();


    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString(){
        return brand + " - " + model + ", "+ year;
    }
}
