package org.example;

public class Main {
    public static void main(String[] args) {
        FourOperations fourOperations = new FourOperations();
        System.out.println(fourOperations.collect(5,10));
        System.out.println(fourOperations.collect(10,15,20));
    }
}