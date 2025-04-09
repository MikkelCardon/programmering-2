package opgave04.models;

import java.util.ArrayList;
import java.util.List;

public class Book implements Subject{
    private final String title; // not empty
    private int count;
    private List<Customer> bougtBy = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();


    public Book(String title) {
        this.title = title;
        this.count = 0;
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public void incCount(int amount) {
        count += amount;
    }

    public void decCount(int amount) {
        count -= amount;
        change();
    }

    public void addCustomer(Customer customer){
        bougtBy.add(customer);
    }

    @Override
    public String toString() {
        return title + "(" + count + ")";
    }

    @Override
    public void change() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<Customer> getBougtBy() {
        return bougtBy;
    }
}
