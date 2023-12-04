//built-in
package org.example;

import org.example.mathematics.FourOperations;
import org.example.mathematics.Logarithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınız : ");
        String name = scanner.nextLine();
        System.out.println("Merhaba " + name);

        FourOperations fourOperations = new FourOperations();
        System.out.println(fourOperations.collect(2,3));
        Logarithm logarithm = new Logarithm();
        System.out.println(logarithm.logarithmCalculate());
    }
}