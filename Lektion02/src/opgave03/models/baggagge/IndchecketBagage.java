package opgave03.models.baggagge;
import opgave03.models.Booking;
import opgave03.models.tilkøb.Tilkøb;


public class IndchecketBagage {
    private int vægt;

    public IndchecketBagage(int vægt) {
        this.vægt = vægt;
    }

    public int getVægt() {
        return vægt;
    }
}
