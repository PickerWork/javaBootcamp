package org.example;

public class Main {
    public static void main(String[] args) {
        findingNumber();
    }

    public static void findingNumber() {
        int[] numbers = new int[]{1,2,5,7,9,0};
        int search = 5;
        boolean isThere =false;

        for(int number : numbers){
            if (number==search){
                isThere = true;
                System.out.println("Sayı var mı? ---> " + isThere + " --->" + " Aranan Sayı:" + search);
                break;
            }
        }
        if(isThere){
            messageSend("Sayı mevcutttur :"+search);
        }else {
            messageSend("Sayı mevcut değildir :"+search);
        }
    }
    public static void messageSend(String message) {
        System.out.println(message);
    }
}