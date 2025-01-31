package opgave02.models;

import java.util.ArrayList;

public class TVSerie extends SuperContent{
    private int numberOfSeasons;

    public TVSerie(String title, Genre[] genres, ArrayList<Actor> cast, int numberOfSeasons) {
        super(title, genres, cast);
        this.numberOfSeasons = numberOfSeasons;
    }

    @Override
    public String toString(){
        return super.getTitle() + " " + numberOfSeasons + " " + super.getGenres();
    }
}
