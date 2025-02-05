package models;

public interface Rentable {
    void rent();
    void returnVehicle();
    boolean isRented();
}
