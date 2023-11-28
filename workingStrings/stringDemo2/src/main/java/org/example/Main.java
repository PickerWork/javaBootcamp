package org.example;

public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        System.out.println(message);
        System.out.println("--------------------------");
        System.out.println(message.replace(' ','-'));
        //Diğer bir kullanım
        //replace belli bir karakteri değiştirmeyi sağlar büyük İ olabilir.
        System.out.println("--------------------------");
        String newMessage = message.replace(' ','-');
        System.out.println(newMessage);
        System.out.println("--------------------------");
        //Yoğun kullanılır belli bir metni almayı sağlar
        System.out.println(message.substring(2,4));

        System.out.println("--------------------------");

        for(String word : message.split(" ")){
            System.out.println(word);
        }
        System.out.println("--------------------------");
        //Veritabanlarında arama gönderdiğimizde kullanacağız.
        //toLowerCase yazıların hepsini küçültür.
        //toUpperCase yazıların hepsini büyültür.
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println("--------------------------");
        //trim fonksiyonu başında ve sonundaki boşluğu siler.
        System.out.println(message.trim());
    }
}