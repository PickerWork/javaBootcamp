package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer yasin = new Customer (1,"Yasin","Yıldız");
        customers.add(yasin);
        customers.add(new Customer(2,"Samet","Yıldız"));
        customers.add(new Customer(3,"Asaf","Yıldız"));
        customers.remove(yasin);
        for (Customer customer:customers) {
            System.out.println(customer.firstName + " " + customer.lastName);
        }
    }
}