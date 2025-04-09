package opgave01.models;

public interface Subject {
    void measurementsChanged();

    void addObserver(Observer o);

    void removeObserver(Observer o);
}
