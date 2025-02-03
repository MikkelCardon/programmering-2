package opgave03.models.tilkøb;

import opgave03.models.Billettype;
import opgave03.models.Booking;

public class TilløbHåndbagage extends Tilkøb{

    public TilløbHåndbagage(int pris) {
        super(pris);
    }

    public int getPrice(Booking booking){
        if (booking.getAntalHåndbagage() > booking.getBillettype().getAntalHånd()) {
            return super.getPris();
        }
        return 0;
    }
}
