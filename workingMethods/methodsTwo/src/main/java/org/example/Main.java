package org.example;

public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        String newMessage = message.substring(0,2);
        newMessage = cityGive();
        System.out.println(newMessage);
        int sayi = collect(5,7);
        System.out.println(sayi);
        int collect = collect2(2,3,5);
        System.out.println(collect);
    }
    // void operasyonu(emir)
    public static void add(){
        System.out.println("Eklendi");
    }
    public static void delete(){
        System.out.println("Silindi");
    }
    public static void update(){
        System.out.println("Güncellendi");
    }
    public static int collect(int number1,int number2){
        return number1+number2;
    }
    public static int collect2(int... numbers){
        int collect = 0;
        for (int number:numbers){
            collect+=number;
        }
        return collect;
    }
    public static String cityGive(){
        return "Ankara";
    }
}