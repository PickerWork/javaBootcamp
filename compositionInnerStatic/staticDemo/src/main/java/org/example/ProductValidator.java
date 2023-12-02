package org.example;

public class ProductValidator {
    static {
        System.out.println("Static Yapıcı Blok çalıştırıldı");
    }
    public ProductValidator(){
        System.out.println("Yapıcı Blok çalıştırıldı");
    }
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }

    }
    public void bla(){

    }

    //inner class
    public static class anotherClass {
        public static void Delete(){

        }
    }
}
