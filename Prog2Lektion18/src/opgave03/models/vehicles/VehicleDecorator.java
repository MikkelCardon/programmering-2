package opgave03.models.vehicles;

public abstract class VehicleDecorator extends Vehicle {
    private Vehicle vehicle;
    private int lejePerDag;
    private boolean erUdlejet;

    public VehicleDecorator (Vehicle vehicle, int lejePris, boolean erUdlejet) {
        super(vehicle.getMake(), vehicle.getModel());
        this.vehicle = vehicle;
        this.lejePerDag = lejePris;
        this.erUdlejet = erUdlejet;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getLejePerDag() {
        return lejePerDag;
    }

    public boolean isErUdlejet() {
        return erUdlejet;
    }
}
