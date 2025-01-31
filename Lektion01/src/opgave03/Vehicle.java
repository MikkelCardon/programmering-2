package opgave03;

import opgave03.models.Rocket;
import opgave03.models.Truck;

public class Vehicle {
    private int topSpeed;
    private int acceleration;
    private int currentSpeed = 0;

    public Vehicle(int topSpeed, int acceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    public void displayInfo() {
        System.out.println(this.getClass().getSimpleName() + ", current speed: " + currentSpeed);
    }

    public void accelerate() {
        currentSpeed += (topSpeed - currentSpeed) * acceleration / 100;
    }

    public void brake() {
        if (getClass() == Rocket.class){
            System.out.println("Rocket cant break");
            return;
        }
        currentSpeed -= (currentSpeed) * 30 / 100;
    }


    public int getTopSpeed() {
        return topSpeed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
