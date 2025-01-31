package opgave03.models;

import opgave03.Vehicle;

public class Truck extends Vehicle {
    private int maxCapacity;
    private int currentLoad = 0;

    public Truck(int topSpeed, int acceleration, int maxCapacity) {
        super(topSpeed, acceleration);
        this.maxCapacity = maxCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println(this.getClass().getSimpleName() + ", current speed: " + super.getCurrentSpeed());
        System.out.println("Loaded weight: " + currentLoad);
    }

    public void loadGoods(int amount) {
        if ((currentLoad + amount) > maxCapacity) {
            throw new IllegalArgumentException("Maximum capacity(" + maxCapacity + ") exceeded");
        }
        currentLoad += amount;
    }

    public void unload() {
        currentLoad = 0;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }
}
