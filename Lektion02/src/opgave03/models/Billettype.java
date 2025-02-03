package opgave03.models;

public enum Billettype {
    GO_LIGHT(0,0,0), GO_SMART(1,1,23), BUSINESS(1,2,32);

    private int antalHånd;
    private int antalIndCheck;
    private int maksVægt;

    Billettype(int antalHånd, int antalIndCheck, int maksVægt) {
        this.antalHånd = antalHånd;
        this.antalIndCheck = antalIndCheck;
        this.maksVægt = maksVægt;
    }

    public int getAntalHånd() {
        return antalHånd;
    }

    public int getAntalIndCheck() {
        return antalIndCheck;
    }

    public int getMaksVægt() {
        return maksVægt;
    }
}
