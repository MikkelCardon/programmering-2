package opgave01.figur;

import opgave01.GeometriskFigur;
import opgave01.Resizable;

public class kvadrat extends GeometriskFigur implements Resizable {
    private double side;

    public kvadrat(int x, int y, double side) {
        super(x, y);
        this.side = side;
    }

    public double areal(){
        return side * side;
    }

    @Override
    public void doubleUp(){
        side *= 2;
    }
    @Override
    public void halve(){
        side /= 2;
    }
}
