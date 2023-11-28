package org.example;

public class Main {
    public static void main(String[] args) {
        //For
        //i=i+1 ---> number++
        for (int counter = 2; counter <= 10; counter += 2) {
            System.out.println(counter);
        }
        System.out.println("For Döngüsü Bitmiştir."+"\n----------------------");

        //While
        int counter = 1;
        while (counter <= 10) {
            System.out.println(counter);
            counter+=2;
        }
        System.out.println("While Döngüsü Bitmiştir."+"\n----------------------");
        //Do while gibi değildir şart sağlanmıyorsa çalışmaz.

        //Do-While
        int counter1 =1;
        do{
            System.out.println(counter1);
            counter1+=2;
        }while (counter1 <= 10);
        System.out.println("Do While Döngüsü Bitmiştir.");
        //Şartları sağlamasa bile bir kere çalıştırır.

    }
}