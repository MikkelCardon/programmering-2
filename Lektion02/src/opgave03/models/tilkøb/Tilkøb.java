package opgave03.models.tilkøb;


import opgave03.models.Booking;

public abstract class Tilkøb {
    private int pris;

    public Tilkøb(int pris) {
        this.pris = pris;
    }

    public int getPris() {
        return pris;
    }

    public abstract int getPrice(Booking booking);
}
