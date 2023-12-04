package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    //1. Yöntem "throws FileNotFoundException"
    //2.Yöntem ---
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Yasin\\Desktop\\UdemyJava\\errorManagement\\readingFileDemo\\src\\main\\java\\org\\example\\number.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            }catch (Exception exception){

            }

        }
    }
}