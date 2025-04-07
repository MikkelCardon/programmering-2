package Ekstra.exercise3;

import Ekstra.exercise3.models.CompareAge;
import Ekstra.exercise3.models.Customer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("John Doe", 30));
        customers.add(new Customer("Jane Smith", 25));
        customers.add(new Customer("Alice Johnson", 35));
        customers.add(new Customer("Bob Brown", 28));
        customers.add(new Customer("Charlie Black", 22));
        customers.add(new Customer("Diana White", 40));

        System.out.println(customers);

        Customer.setComparator(new CompareAge());
        customers.sort(Customer.getComparator());

        System.out.println(customers);
    }
}
