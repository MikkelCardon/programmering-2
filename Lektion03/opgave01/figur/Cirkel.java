package opgave01.figur;

import opgave01.GeometriskFigur;
import opgave01.Resizable;

public class Cirkel extends GeometriskFigur implements Resizable {
    private int radius;

    public Cirkel(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public double areal(){
        return radius*radius*Math.PI;
    }

    @Override
    public void doubleUp(){
        radius *= 2;
    }
    @Override
    public void halve(){
        radius /= 2;
    }

}
