package org.example;

public class Main {
    public static void main(String[] args) {
        String student1= "Joe";
        String student2= "Jhon";
        String student3= "Alex";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("-----------------------------");

        String[] students = new String[4];
        students[0]="Joe";
        students[1]="Jhon";
        students[2]="Alex";
        students[3]="Lorem";

        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }

        System.out.println("-----------------------------");

        for (String student:students){
            System.out.println(student);
        }
    }
}