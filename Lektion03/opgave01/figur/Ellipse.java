package opgave01.figur;

import opgave01.GeometriskFigur;
import opgave01.Resizable;

public class Ellipse extends GeometriskFigur implements Resizable {
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

    @Override
    public void doubleUp(){
        r1 *= 2;
        r2 *= 2;
    }
    @Override
    public void halve(){
        r1 /= 2;
        r2 /= 2;
    }
}
