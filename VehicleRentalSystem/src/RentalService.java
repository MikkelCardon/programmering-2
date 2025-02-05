import models.Rentable;

import java.util.ArrayList;

public class RentalService {
    private ArrayList<Rentable> rentableVehicles = new ArrayList<>();
    private String navnPåService;

    public RentalService(String navnPåService) {
        this.navnPåService = navnPåService;
    }

    ArrayList<Rentable> availableCars = new ArrayList<>();
    public void showAvailableVehicles(){

        int number = 0;
        for (Rentable vehicle : rentableVehicles) {
            if (!vehicle.isRented()){
                availableCars.add(vehicle);
                System.out.println(number++ + " - " + vehicle);
            }
        }
    }

    public void getAvailableVehicles(){
        availableCars = new ArrayList<>();
        for (Rentable vehicle : rentableVehicles) {
            if (!vehicle.isRented()){
                availableCars.add(vehicle);
            }
        }
    }

    public Rentable rentByIndex(int index){
        getAvailableVehicles();
        Rentable vehicle = availableCars.get(index);
        vehicle.rent();
        System.out.println("You have rented: " + vehicle);
        return vehicle;
    }

    public void addRentedCar(Rentable newVehicle){
        if (!rentableVehicles.contains(newVehicle)){
            rentableVehicles.add(newVehicle);
        }
    }

    @Override
    public String toString() {
        return navnPåService;
    }
}
