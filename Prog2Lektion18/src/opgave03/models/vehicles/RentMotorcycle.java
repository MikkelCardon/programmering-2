package opgave03.models.vehicles;

public class RentMotorcycle extends VehicleDecorator{
    int cc;

    public RentMotorcycle(Vehicle vehicle, int lejePris, boolean erUdlejet, int cc) {
        super(vehicle, lejePris, erUdlejet);
        this.cc = cc;
    }

    @Override
    public String toString() {
        return super.toString() + " cc: " + cc + " lejePerDag: " + getLejePerDag() + " erUdlejet: " + isErUdlejet();
    }

    public int getCc() {
        return cc;
    }
}
