package Ekstra.exercise3.models;

import java.util.Comparator;

public class Customer {
    private String name;
    private int age;
    private static Comparator<Customer > comparator;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Comparator<Customer> getComparator() {
        return comparator;
    }

    public static void setComparator(Comparator<Customer> comparator) {
        Customer.comparator = comparator;
    }

    public String toString(){
        return "Name: " + name + ", Age: " + age;
    }
}
