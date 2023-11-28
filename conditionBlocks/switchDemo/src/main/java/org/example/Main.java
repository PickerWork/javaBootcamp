package org.example;

public class Main {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel geçtiniz!");
                break;
            /*case 'B':
                System.out.println("Çok iyi geçtiniz!");
                break;
            case 'C':
                System.out.println("İyi geçtiniz!");
                break;
            */
            //Belli bir durumda aynı kod bloğunu çalıştırmak gerekebilir.
            case 'B':
            case 'C':
                System.out.println("İyi geçtiniz!");
                break;
            //B de yazsan C de yazsan çıktı "İyi geçtiniz!" yazar.
            case 'D':
                System.out.println("Fena değil geçtiniz!");
                break;
            case 'F':
                System.out.println("Lütfen daha çok çalışın geçemediniz!");
                break;
            default:
                System.out.println("Geçersiz not girdiniz lütfen tekrar deneyiniz.");
        }
    }
}