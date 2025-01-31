package opgave02;

import opgave02.models.*;
import opgave02.storage.Storage;

import java.util.ArrayList;

public class Controller {
    public static void getMoviesByDirector(Director director){
        for (Movie movie : Storage.getMovies()) {
            if (movie.getDirector().equals(director)){
                System.out.println(movie);
            }
        }
    }

    public static void getSerieByGenre(Genre genre){
        for (TVSerie series : Storage.getSeries()) {
            for (Genre seriesGenre : series.getGenres()) {
                if (seriesGenre.equals(genre)){
                    System.out.println(series);
                }
            }
        }
    }

    public static void getSerieByMultipleGenres(ArrayList<Genre> searchGenres){
        for (TVSerie series : Storage.getSeries()) {
            for (Genre currentGenre : series.getGenres()) {
                for (Genre searchGenre : searchGenres) {
                    if (currentGenre.equals(searchGenre)){
                        System.out.println(series);
                        return;
                    }
                }
            }
        }
    }

    public static void getMovieByMultipleGenres(ArrayList<Genre> searchGenres){
        for (Movie movie : Storage.getMovies()) {
            for (Genre genre : movie.getGenres()) {
                for (Genre searchGenre : searchGenres) {
                    if (genre.equals(searchGenre)){
                        System.out.println(movie);
                        return;
                    }
                }
            }
        }
    }

    public static void getMovieOrSerieFromGenres(ArrayList<Genre> searchGenres){
        for (SuperContent content : Storage.returnMoviesAndSeries()) {
            for (Genre genre : content.getGenres()) {
                for (Genre searchGenre : searchGenres) {
                    if (genre.equals(searchGenre)){
                        System.out.println(content);
                        return;
                    }
                }
            }
        }
    }

}
