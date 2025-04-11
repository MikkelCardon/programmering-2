package opgave03.models.vehicles;

public class Motorcycle extends Vehicle {
    private int cc;
    public Motorcycle(String make, String model, int cc) {
        super(make, model);
        this.cc = cc;
    }

    @Override
    public String toString() {
        return super.toString() + " cc: " + cc;
    }
}
