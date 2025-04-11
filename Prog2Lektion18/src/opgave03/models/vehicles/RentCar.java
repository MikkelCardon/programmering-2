package opgave03.models.vehicles;

public class RentCar extends VehicleDecorator{
    public RentCar(Vehicle vehicle, int lejePris, boolean erUdlejet) {
        super(vehicle, lejePris, erUdlejet);
    }

    @Override
    public String toString() {
        return super.toString() + " lejePerDag: " + getLejePerDag() + " erUdlejet: " + isErUdlejet();
    }
}
