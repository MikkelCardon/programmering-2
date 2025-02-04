package opgave02_Lektion3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    private static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        createCustomer("Carl", "Kevinsen", 22);
        createCustomer("Alan", "Bunne", 25);
        createCustomer("Dennis", "Flemmingsen", 99);
        createCustomer("Falk", "Cardon", 23);
        Customer erik = createCustomer("Erik", "Wilhemsen", 65);
        Customer benny = createCustomer("Benny", "Eriksen", 50);
        createCustomer("Carl", "Kevinsen", 10);

        // Make array
        Customer[] customerArray = new Customer[customers.size()];
        for (int i = 0; i < customers.size(); i++) {
            customerArray[i] = customers.get(i);
        }


//        System.out.println("Sidste customer: " + lastCustomer(customerArray));
//        //System.out.println(lastCustomerArrayList());
//
//        for (Customer customer : customerArray) {
//            System.out.println(customer);
//        }

        Customer[] newCustomers = afterCustomerArray(customerArray, benny);
        for (Customer newCustomer : newCustomers) {
            System.out.println(newCustomer);
        }
    }

    public static Customer createCustomer(String firstName, String lastName, int alder){
        Customer customer = new Customer(firstName, lastName, alder);
        customers.add(customer);
        return customer;
    }

    //Sort med ArrayList
    public static Customer lastCustomerArrayList(){
        Collections.sort(customers);
        return customers.getLast();
    }

    //Sort manuelt med bubbleSort
    public static Customer lastCustomer(Customer[] customers){
        sortCustomerArray(customers);
        return customers[customers.length-1];
    }

    public static void sortCustomerArray(Customer[] customers){
        boolean beenSwapped = true;

        while(beenSwapped){
            beenSwapped = false;
            for (int i = 0; i < customers.length-1; i++) {
                if (customers[i].compareTo(customers[i+1]) > 0){
                    Customer temp = customers[i];
                    customers[i] = customers[i+1];
                    customers[i+1] = temp;
                    beenSwapped = true;
                }
            }
        }
    }



    public static Customer[] afterCustomerArray(Customer[] customers, Customer customer){
        sortCustomerArray(customers);
        int indexOfCustomer = 0;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == customer){
                indexOfCustomer = i;
                break;
            }
        }
        int sizeOfNewArray = customers.length - (indexOfCustomer+1);
        if (sizeOfNewArray == 0) return null;
        Customer[] afterCustomers = new Customer[sizeOfNewArray];
        int j = 0;
            for (int i = indexOfCustomer+1; i < customers.length; i++) {
                afterCustomers[j++] = customers[i];
            }


        return afterCustomers;
    }
}
