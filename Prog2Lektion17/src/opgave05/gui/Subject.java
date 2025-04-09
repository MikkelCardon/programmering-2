package opgave05.gui;

public interface Subject {
    void change();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
}
