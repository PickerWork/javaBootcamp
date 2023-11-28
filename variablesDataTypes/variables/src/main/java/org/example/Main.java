package org.example;

public class Main {
    public static void main(String[] args) {


        /*
        System.out.println("Student Number : 10");
        System.out.println("Student Number : 10");
        System.out.println("Student Number : 10");
        System.out.println("Student Number : 10");

        Girilen verileri düzenlemek çok uzun uğraşlar gerektirir.(Teker teker düzeltmek gibi.Hammalıktan başka bir şey değildir.)
        Reusability ve Code Refactoring için kodu daha düzenlenebilir iyileştirilebilir bir hale getirebiliriz.
        Hem bellekte tasarruf sağlamış olur hem de kodun daha hızlı çalışmasını sağlayabiliriz.
        Bu yüzden variablelarla çalışmak çok doğru bir kazanım olur.
         */

        int studentNumber = 10;
        String message = "Student Number : ";

        System.out.println(message + studentNumber);
        System.out.println(message + studentNumber);
        System.out.println(message + studentNumber);

        //Burada hem mesajı hem de öğrenci sayısını tek bir yerden değiştirebilirsin.



    }
}