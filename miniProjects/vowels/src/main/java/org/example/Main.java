package org.example;

public class Main {
    public static void main(String[] args) {
        char character = 'B';
        //Böyle çok uzun bir kod oluyor daha anlaşılabilir bir kod yazılabilir.
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Uzun kod ve hammallık : Başlangıç : 8.Satır Bitiş : 36");
        switch (character) {
            case 'A':
                System.out.println("Kalın sesli harf");
                break;
            case 'I':
                System.out.println("Kalın sesli harf");
                break;
            case 'O':
                System.out.println("Kalın sesli harf");
                break;
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            case 'E':
                System.out.println("İnce sesli harf");
                break;
            case 'İ':
                System.out.println("İnce sesli harf");
                break;
            case 'Ö':
                System.out.println("İnce sesli harf");
                break;
            case 'Ü':
                System.out.println("İnce sesli harf");
                break;
            default:
                System.out.println("Geçersiz harf girdiniz!");

        }
        System.out.println("-------------------------------------------------------------------------------");
        //Hocanın verdiği örnek(Buglı)
        System.out.println("Hocanın verdiği örnek:Buglı");
        switch (character){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Kısaltılmış,bugsız kod ve özellik kullanımı : Başlangıç : 39.Satır Bitiş : 54");
        switch (character) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("İnce sesli harf");
                break;
            default:
                System.out.println("Geçersiz harf girdiniz!");
        }
    }
}