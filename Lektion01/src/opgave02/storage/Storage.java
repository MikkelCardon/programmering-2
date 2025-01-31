package opgave02.storage;

import opgave02.models.Actor;
import opgave02.models.Movie;
import opgave02.models.SuperContent;
import opgave02.models.TVSerie;

import java.util.ArrayList;
import java.util.Arrays;

public class Storage {
    private static ArrayList<Movie> movies = new ArrayList<>();
    private static ArrayList<TVSerie> series = new ArrayList<>();
    private static ArrayList<Actor> actors = new ArrayList<>();

    public static ArrayList<SuperContent> returnMoviesAndSeries(){
        ArrayList<SuperContent> moviesAndSeries = new ArrayList<>();
        moviesAndSeries.addAll(movies);
        moviesAndSeries.addAll(series);
        return new ArrayList<SuperContent>(moviesAndSeries);
    }


    public static void addMovie(Movie movie) {
        if (!movies.contains(movie)) {
            movies.add(movie);
        }
    }
    public static void printMovies(){
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
    public static void printSeries(){
        for (TVSerie tvSerie : series) {
            System.out.println(tvSerie);
        }
    }
    public static void printActors(){
        for (Actor actor : actors) {
            System.out.println(actor);
        }
    }

    public static void addActor(Actor actor) {
        if (!actors.contains(actor)) {
            actors.add(actor);
        }
    }

    public static void addTVSerie(TVSerie serie) {
        if (!series.contains(serie)) {
            series.add(serie);
        }
    }

    public static ArrayList<Movie> getMovies() {
        return movies;
    }

    public static ArrayList<TVSerie> getSeries() {
        return series;
    }

    public static ArrayList<Actor> getActors() {
        return actors;
    }
}
