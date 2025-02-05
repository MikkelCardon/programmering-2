import models.Rentable;

import java.util.ArrayList;

public class RentalCustomer {
    ArrayList<Rentable> rentedCars = new ArrayList<>();
    private String name;

    public RentalCustomer(String name) {
        this.name = name;
    }

    public void addRentedCar(Rentable vehicle){
        if (!rentedCars.contains(vehicle)){
            rentedCars.add(vehicle);
        }
    }
    public void removeRentedCar(Rentable vehicle){
        if (rentedCars.contains(vehicle)){
            rentedCars.remove(vehicle);
        }
    }
    public void printRentedCars(){
        if (rentedCars.isEmpty()){
            System.out.println("You have no rented cars");
            System.out.println("Write 'Menu' to return");
        }
        else {
            int number = 0;
            for (Rentable rentedCar : rentedCars) {
                System.out.println(number++ + " - " + rentedCar);
            }
            System.out.println("Write the number of the car you want to return.");
            System.out.println("'Menu' to return");
        }
    }

    public ArrayList<Rentable> getRentedCars() {
        return rentedCars;
    }
}
