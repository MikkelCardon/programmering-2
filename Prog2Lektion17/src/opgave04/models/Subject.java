package opgave04.models;

import java.util.ArrayList;

public interface Subject {
    void change();

    void addObserver(Observer observer);
    void removeObserver(Observer observer);

}
