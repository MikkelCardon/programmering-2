package opgave01.figur;

import opgave01.GeometriskFigur;

public class Ellipse extends GeometriskFigur {
    private double r1;
    private double r2;

    public Ellipse(int x, int y, double r1, double r2) {
        super(x, y);
        this.r1 = r1;
        this.r2 = r2;
    }

    public double areal(){
        return r1*r2*Math.PI;
    }
}
