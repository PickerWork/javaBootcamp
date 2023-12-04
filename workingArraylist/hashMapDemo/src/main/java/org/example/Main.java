package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> glossary = new HashMap<String,String>();
        glossary.put("Book","Kitap");
        glossary.put("Table","Masa");
        glossary.put("Computer","Bilgisayar");
        System.out.println(glossary.size());

        for (String item: glossary.keySet()){
            System.out.println("Eleman : " + item + " ---- Değer : " + glossary.get(item));
        }
        glossary.remove("Table");
        glossary.clear();
        System.out.println(glossary.get("Table"));
    }
}