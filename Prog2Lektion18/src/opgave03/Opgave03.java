package opgave03;

import opgave03.models.vehicles.*;

import java.util.List;

public class Opgave03 {
    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(
                new Car("Ford", "Mustang", CarType.SEDAN),
                new Car("Nissan", "Leaf", CarType.HATCHBACK),
                new Car("Volkswagen", "Golf", CarType.CABRIOLET),
                new Motorcycle("Harley-Davidson", "Street Bob", 700),
                new Motorcycle("Kawasaki", "Ninja", 1000)
        );
        Vehicle ford = vehicles.getFirst();

        VehicleDecorator carForRent = new RentCar(ford, 200, false);
        VehicleDecorator motorcycleForRent = new RentMotorcycle(vehicles.get(3), 100, true, 120);

        System.out.println(carForRent.getLejePerDag());
        vehicles.forEach(System.out::println);
    }
}
