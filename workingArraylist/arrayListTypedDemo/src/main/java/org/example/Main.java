package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Kocaeli");
        cities.add("İzmir");
        cities.add("İstanbul");
        cities.add("Aydın");

        cities.remove("İstanbul");
        Collections.sort(cities);
        for (String city : cities) {
            System.out.println(city);
        }
    }
}