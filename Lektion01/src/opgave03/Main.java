package opgave03;

import opgave03.models.Car;
import opgave03.models.Rocket;
import opgave03.models.Truck;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(180, 20);
        car.accelerate();
        car.displayInfo();
        car.accelerate();
        car.displayInfo();
        car.brake();
        car.displayInfo();

        Truck truck = new Truck(120, 10, 10);
        truck.accelerate();
        truck.accelerate();
        truck.displayInfo();
        try {
            truck.loadGoods(5);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        truck.brake();
        truck.displayInfo();
        try {
            truck.loadGoods(10);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        truck.displayInfo();
        truck.unload();
        truck.displayInfo();

        Rocket rocket = new Rocket(25000, 50);
        rocket.accelerate();
        rocket.accelerate();
        rocket.displayInfo();
        rocket.brake();
        rocket.displayInfo();
    }
}
