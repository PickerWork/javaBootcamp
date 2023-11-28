package org.example;

public class Main {
    public static void main(String[] args) {
        int number = 1;
        int total = 0;
        for (int i=1;i<number;i++){
            if(number % i == 0){
                total = total + i;
            }
        }
        if(total==number){
            System.out.println("Girdiğiniz sayı mükkemel sayıdır.");
        }else {
            System.out.println("Girdiğiniz sayı mükkemel sayı değildir.");
        }
    }
}