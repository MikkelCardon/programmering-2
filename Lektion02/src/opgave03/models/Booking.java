package opgave03.models;

import opgave03.models.baggagge.IndchecketBagage;

import java.util.ArrayList;

public class Booking {
    private Billettype billettype;
    private int antalHåndbagage;
    private ArrayList<IndchecketBagage> indchecketBagage;

    private int pris;

    public Booking(Billettype billettype, int antalHåndbagage, ArrayList<IndchecketBagage> indchecketBagage) {
        this.billettype = billettype;
        this.antalHåndbagage = antalHåndbagage;
        this.indchecketBagage = indchecketBagage;
    }

    public void addHåndbagage(){
        if (antalHåndbagage > 0){
            System.out.println("KAN IKKE TILKØBE EKSTRA HÅNDBAGAGE");
        }
        antalHåndbagage++;
    }

    public Billettype getBillettype() {
        return billettype;
    }

    public int getAntalHåndbagage() {
        return antalHåndbagage;
    }

    public ArrayList<IndchecketBagage> getIndchecketBagage() {
        return indchecketBagage;
    }

    public int getPrice(Booking booking){
        int pris = 0;
        if (booking.getAntalHåndbagage() > booking.getBillettype().getAntalHånd()) {
            pris += 120;
        }

        if (booking.getIndchecketBagage().size() > booking.getBillettype().getAntalIndCheck()){
            pris += (booking.getIndchecketBagage().size() - booking.getBillettype().getAntalIndCheck()) * 310;
        }

        for (IndchecketBagage bagage : booking.getIndchecketBagage()) {
            if (bagage.getVægt() > booking.getBillettype().getMaksVægt()){
                if (bagage.getVægt() >= 23.1 && bagage.getVægt() <= 28){
                    pris+= 330;
                }
                if (bagage.getVægt() > 28){
                    pris+= 590;
                }
            }
        }
        return pris;
    }
}
