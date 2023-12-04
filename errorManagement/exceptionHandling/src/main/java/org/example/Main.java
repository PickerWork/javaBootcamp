package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            int [] numbers = new int[] {1,2,3};
            System.out.println(numbers[4]);
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception+" \nHata oluştu!");
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception+" \nHata oluştu!");
        }catch (Exception exception){
            System.out.println("Hata Loglandı : " + exception);
        }
        finally { //Veritabanına bağlanırken
            System.out.println("Ben her türlü çalışırım.");
        }
        //Exception lar inheritance yapısına sahiptir fakat hepsi exceptiondır.
    }
}