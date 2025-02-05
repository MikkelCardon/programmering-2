import jdk.swing.interop.SwingInterOpUtils;
import models.Brand;
import models.Car;
import models.Rentable;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<RentalService> rentalServices = new ArrayList<>();

    public static void main(String[] args) {
        RentalService carGroup = new RentalService("Car Group");
        rentalServices.add(carGroup);

        RentalService euroCar = new RentalService("EuroCar Esbjerg");
        rentalServices.add(euroCar);
        initContent(carGroup, euroCar);

        rentalCustomer = new RentalCustomer("Mikkel");

        //carGroup.showAvailableVehicles();
        startConsole();
    }

    private static RentalCustomer rentalCustomer;
    private static RentalService selectedService;
    private static String view = "Menu";

    public static void startConsole(){
        boolean consoleRunning = true;
        Scanner scanner = new Scanner(System.in);

        showOptions();
        while (consoleRunning){
            System.out.print("Input: ");
            String input = scanner.next();

            if (input.equals("exit")){
                consoleRunning = false;
                scanner.close();
                System.out.println("SCANNER CLOSING.....");
                break;
            }

            else if (input.equals("Menu")){
                view = "Menu";
            }

            else {
                int number = Integer.parseInt(input);
                if (view.equals("Menu")){
                    if (number == 1) view = "RentalService";
                    else if (number == 2) view = "MyCars";
                }
                else if (view.equals("RentalService")){
                    selectedService = rentalServices.get(number);
                    view = "Vehicles";
                }
                else if (view.equals("MyCars")){
                    Rentable vehicle = rentalCustomer.getRentedCars().get(number);
                    rentalCustomer.removeRentedCar(vehicle);
                    vehicle.returnVehicle();
                }
                else if(view.equals("Vehicles")){
                    Rentable vehicle = selectedService.rentByIndex(number);
                    rentalCustomer.addRentedCar(vehicle);
                }
            }
            System.out.println("-------------------------");
            System.out.println("-------------------------");
            showOptions();
        }
    }
    public static void showOptions(){
        if(view.equals("Menu")){
            System.out.println("1. Rent a car");
            System.out.println("2. Show my rented car");
        }
        else if (view.equals("RentalService")){
            int number = 0;
            System.out.println("Vælg en rentalService:");
            for (RentalService rentalService : rentalServices) {
                System.out.println(number++ + " - " + rentalService);
            }
            System.out.println("Type 'exit' to stop");
        }
        else if(view.equals("MyCars")){
            rentalCustomer.printRentedCars();
        }
        else if(view.equals("Vehicles")){
            System.out.println("Rent a car, Select a car");
            selectedService.showAvailableVehicles();
            System.out.println("Type 'exit' to stop or 'Menu' to go back");
        }
    }


    public static void addNewRentable(Rentable newVehicle, RentalService service){
        service.addRentedCar(newVehicle);
    }

    public static void initContent(RentalService carGroup, RentalService euroCar){
        addNewRentable(new Car(Brand.AUDI, "A8", 2024), carGroup);
        addNewRentable(new Car(Brand.BMW, "X5", 2023), carGroup);
        addNewRentable(new Car(Brand.MERCEDES, "C-Class", 2022), carGroup);
        addNewRentable(new Car(Brand.TESLA, "Model S", 2024), carGroup);
        addNewRentable(new Car(Brand.FORD, "Mustang", 2023), carGroup);
        addNewRentable(new Car(Brand.TOYOTA, "Corolla", 2021), carGroup);
        addNewRentable(new Car(Brand.VOLKSWAGEN, "Tiguan", 2020), carGroup);
        addNewRentable(new Car(Brand.HONDA, "Civic", 2019), carGroup);
        addNewRentable(new Car(Brand.PORSCHE, "911", 2023), carGroup);
        addNewRentable(new Car(Brand.CHEVROLET, "Camaro", 2022), carGroup);

        addNewRentable(new Car(Brand.JEEP, "Grand Cherokee", 2021), euroCar);
        addNewRentable(new Car(Brand.HYUNDAI, "Elantra", 2020), euroCar);
        addNewRentable(new Car(Brand.KIA, "Sportage", 2023), euroCar);
        addNewRentable(new Car(Brand.VOLVO, "XC60", 2022), euroCar);
        addNewRentable(new Car(Brand.NISSAN, "Altima", 2021), euroCar);
        addNewRentable(new Car(Brand.SUBARU, "Forester", 2020), euroCar);
        addNewRentable(new Car(Brand.MAZDA, "CX-5", 2019), euroCar);
        addNewRentable(new Car(Brand.TOYOTA, "Challenger", 2023), euroCar);
        addNewRentable(new Car(Brand.MERCEDES, "500", 2022), euroCar);
        addNewRentable(new Car(Brand.FORD, "Range Rover", 2024), euroCar);
    }
}
