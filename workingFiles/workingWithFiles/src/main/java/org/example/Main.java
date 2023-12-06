package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //createFile();
        //getFileInfo();
        readFile();
        writeFile();
        readFile();


    }
    //Dosya oluşturma :
    public static void createFile() {
        File file = new File("C:\\Users\\Yasin\\Desktop\\UdemyJava\\files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu!");
            } else {
                System.out.println("Dosya zaten mevcut!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Dosya adı-yolu :
    public static void getFileInfo (){
        File file = new File("C:\\Users\\Yasin\\Desktop\\UdemyJava\\files\\students.txt");
        if(file.exists()){
            System.out.println("Dosya adı: "+ file.getName());
            System.out.println("Dosya yolu: "+ file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi?: "+ file.canWrite());
            System.out.println("Dosya okunabilir mi?: "+ file.canRead());
            System.out.println("Dosya boyutu (byte): "+ file.length());
        }
    }

    //Dosya okuma :
    public static void readFile(){
        File file = new File("C:\\Users\\Yasin\\Desktop\\UdemyJava\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    //Dosyaya yazma :
    public static void writeFile (){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Yasin\\Desktop\\UdemyJava\\files\\students.txt",true));
            writer.newLine();
            writer.write("Samet"); //\n de kullanılabiliyor
            System.out.println("Dosyaya yazıldı.");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}