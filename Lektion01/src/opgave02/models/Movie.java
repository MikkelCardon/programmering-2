package opgave02.models;

import java.util.ArrayList;

public class Movie extends SuperContent{
    private int productionYear;
    private Director director;
    private double rating;

    public Movie(String title, Genre[] genres, ArrayList<Actor> cast, int productionYear, Director director, double rating) {
        super(title, genres, cast);
        this.productionYear = productionYear;
        this.director = director;
        this.rating = rating;
    }

    @Override
    public String toString(){
        return super.getTitle() + " " + productionYear + " " + super.getGenres();
    }

    public int getProductionYear() {
        return productionYear;
    }

    public Director getDirector() {
        return director;
    }

    public double getRating() {
        return rating;
    }
}
