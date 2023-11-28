package org.example;

public class Main {
    public static void main(String[] args) {
        FourOperations fourOperations = new FourOperations();
        int result = fourOperations.Collect(4,7);
        System.out.println("Toplam :" + result);

        FourOperations fourOperations1 = new FourOperations();
        int extraction = fourOperations1.Extraction(50,5);
        System.out.println("Çıkarma :" + extraction);

        FourOperations fourOperations2 = new FourOperations();
        int multiplication = fourOperations2.Multiplication(90,50);
        System.out.println("Çarpma :" + multiplication);

        FourOperations fourOperations3 = new FourOperations();
        double division = fourOperations3.Division(100,7);
        System.out.println("Bölme :" + division);
    }
}