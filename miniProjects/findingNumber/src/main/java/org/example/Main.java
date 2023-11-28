package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,5,7,9,0};
        int search = 6;
        boolean isThere =false;

        for(int number : numbers){
            if (number==search){
                isThere = true;
                System.out.println("Sayı var mı? ---> " + isThere + " --->" + " Aranan Sayı:" + search);
                break;
            }
        }
        if(isThere){
            System.out.println("Sayı mevcuttur.");
        }else {
            System.out.println("Sayı mevcut değildir.");
        }
    }
}