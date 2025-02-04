package opgave01.figur;

import opgave01.GeometriskFigur;
import opgave01.Resizable;

public class Rektangel extends GeometriskFigur implements Resizable {
    private double s1;
    private double s2;

    public Rektangel(int x, int y, double s1, double s2) {
        super(x, y);
        this.s1 = s1;
        this.s2 = s2;
    }

    public double areal(){
        return s1 * s2;
    }

    @Override
    public void doubleUp(){
        s1 *= 2;
        s2 *= 2;
    }
    @Override
    public void halve(){
        s1 /= 2;
        s2 /= 2;
    }
}
