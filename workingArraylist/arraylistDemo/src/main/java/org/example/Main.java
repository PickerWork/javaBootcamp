package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        /*int numbers[] = new int[]{1,2,3};
        numbers = new int [4];
        System.out.println(numbers[0]);*/
        ArrayList numbers = new ArrayList();

        numbers.add(1);
        numbers.add(10);
        numbers.add("Kocaeli");

        //System.out.println(numbers.size());
        //numbers.set(2,"İzmir");
        //Remove ettiğimiz zaman sola doğru kayar yani 0 kaldırıldıysa 1 i okur.
        //numbers.remove(0);
        //numbers.clear(); //Tüm elemanları sıfırlar.
        //System.out.println(numbers.get(0));

        for (Object i:numbers){
            System.out.println(i);
        }
    }
}