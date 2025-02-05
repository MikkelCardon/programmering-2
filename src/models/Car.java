package models;

public class Car extends Vehicle implements Rentable {
    private boolean rented = false;

    public Car(Brand brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void startEngine(){
        System.out.println("BROM BROM");
    }

    @Override
    public void rent(){
        if (!rented){
            rented = true;
        } else System.out.println("Bil er allrede lejet ud");
    }

    @Override
    public void returnVehicle() {
        if (rented){
            rented = false;
        }
        else System.out.println("Bil er ikke udlejet");
    }

    @Override
    public boolean isRented() {
        return rented;
    }


}
