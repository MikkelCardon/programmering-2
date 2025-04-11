package opgave03.models.vehicles;

public class Car extends Vehicle {
    private CarType type;
    public Car(String make, String model, CarType type) {
        super(make, model);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + " type: " + type;
    }
}
