package Ekstra.exercise3.models;

import java.util.Comparator;

public class CompareAge implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
