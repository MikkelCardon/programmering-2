package opgave02;

import opgave02.storage.Storage;
import opgave02.models.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        initStorage();
    }

    private static void initStorage() {
        Director georgeLukas = new Director("George Walton Lucas Jr.", LocalDate.of(1944, 5, 14));
        Director spielberg = new Director("Steven Spielberg", LocalDate.of(1946, 12, 18));
        Actor ford = new Actor("Harrison Ford", LocalDate.of(1942, 7, 13));
        Storage.addActor(ford);
        Actor hamill = new Actor("Mark Hamill", LocalDate.of(1951, 9, 25));
        Storage.addActor(hamill);
        Actor fisher = new Actor("Carrie Fisher", LocalDate.of(1965, 10, 21));
        Storage.addActor(fisher);
        Actor allan = new Actor("Karen Allen", LocalDate.of(1951, 10, 5));
        Storage.addActor(allan);
        Actor aniston = new Actor("Jennifer Aniston", LocalDate.of(1969, 2, 11));
        Storage.addActor(aniston);
        Actor cox = new Actor("Courteney Cox", LocalDate.of(1964, 6, 15));
        Storage.addActor(cox);
        Actor kudrow = new Actor("Lisa Kudrow", LocalDate.of(1963, 7, 30));
        Storage.addActor(kudrow);
        Actor leBlanc = new Actor("Matt LeBlanc", LocalDate.of(1967, 7, 25));
        Storage.addActor(leBlanc);
        Actor perry = new Actor("Matthew Perry", LocalDate.of(1969, 8, 19));
        Storage.addActor(perry);
        Actor schwimmer = new Actor("David Schwimmer", LocalDate.of(1966, 11, 2));
        Storage.addActor(schwimmer);
        Movie starWars = new Movie("Star Wars", new Genre[]{Genre.ACTION, Genre.FANTACY, Genre.ADVENTURE},new ArrayList<>(List.of(ford, hamill, fisher)),
                1977, georgeLukas,
                 8.6
                );

        Movie indy = new Movie("Raiders of the Lost Ark", new Genre[]{Genre.ACTION, Genre.ADVENTURE}, new ArrayList<>(List.of(ford, allan)), 1981, spielberg,
                 8.4);
        TVSerie friends = new TVSerie("Friends", new Genre[] { Genre.COMEDY, Genre.ROMANCE},new ArrayList<>(List.of(aniston, cox, kudrow, leBlanc, perry, schwimmer)), 11);
        Storage.addMovie(starWars);
        Storage.addMovie(indy);
        Storage.addTVSerie(friends);
    }
}
