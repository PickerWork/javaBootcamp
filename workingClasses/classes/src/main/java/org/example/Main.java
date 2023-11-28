package org.example;

public class Main {
    public static void main(String[] args) {
        //reference type
        //stack-heap stack=numaralandırma heap=yığın gösterim(Garbage collector=bellekten siler.)
        //new ihtiyacın olduğu vakit yaz.
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value
        //Değer tiplerinde soldaki değer eşitin karşısındaki değeri alır heap bölümüne girmez.
        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println("Buranın(number2) 10 olması gerekir :" + number2 + " Buranın(number1) 30 olması gerekir: " + number1);
        //array listler reference typetır heap bölümü vardır *dikkat.
        int[] numbers1 = new int[]{1,2,3};
        int[] numbers2 = new int[]{4,5,6};
        numbers2 = numbers1;
        numbers1 [0]=10;
        System.out.println(numbers2[0]);

    }
}