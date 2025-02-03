package opgave01.figur;

import opgave01.GeometriskFigur;

public class Cirkel extends GeometriskFigur {
    private int radius;

    public Cirkel(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public double areal(){
        return radius*radius*Math.PI;
    }
}
