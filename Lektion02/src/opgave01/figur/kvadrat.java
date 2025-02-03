package opgave01.figur;

import opgave01.GeometriskFigur;

public class kvadrat extends GeometriskFigur {
    private double side;

    public kvadrat(int x, int y, double side) {
        super(x, y);
        this.side = side;
    }

    public double areal(){
        return side * side;
    }
}
