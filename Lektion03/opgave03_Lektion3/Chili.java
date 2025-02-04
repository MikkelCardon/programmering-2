package opgave03_Lektion3;

public class Chili implements Measurable{
    private String navn;
    private int styrke;

    public Chili(String navn, int styrke) {
        this.navn = navn;
        this.styrke = styrke;
    }

    @Override
    public double getMeasure() {
        return styrke;
    }

    @Override
    public String toString(){
        return navn+", "+styrke;
    }
}
