package opgave03.models.vehicles;

public abstract class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return make + " " + model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
