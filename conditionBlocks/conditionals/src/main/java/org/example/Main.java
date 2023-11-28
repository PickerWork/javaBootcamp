package org.example;

public class Main {
    public static void main(String[] args) {
        int number = 25;

        if(number<20){
            System.out.println("Sayı 20 den küçüktür.");
        }else if(number==20) {
            System.out.println("Sayı 20 ye eşittir.");
        }else {
            System.out.println("Sayı 20 den büyüktür." + "\nYazdırılan Sayı : " + number);
        }
    }
}