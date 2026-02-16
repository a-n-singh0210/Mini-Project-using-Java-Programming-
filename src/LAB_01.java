import java.util.Scanner;

import java.util.Scanner;

public class LAB_01 {

    // Student class
    static class Student {

        private String name;
        private int rollNo;
        private int[] marks;
        private double average;
        private char grade;

        // Constructor
        Student(String name, int rollNo, int[] marks) {
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }

        // Method to calculate average
        public void calculateAverage() {
            int total = 0;
            for (int i = 0; i < marks.length; i++) {
                total += marks[i];
            }
            average = total / 5.0;
        }

        // Method to assign grade
        public void calculateGrade() {
            if (average >= 75)
                grade = 'A';
            else if (average >= 50)
                grade = 'B';
            else
                grade = 'C';
        }

        // Method to display details
        public void displayDetails() {
            System.out.println("\n--- Student Details ---");
            System.out.println("Name    : " + name);
            System.out.println("Roll No : " + rollNo);
            System.out.println("Average : " + average);
            System.out.println("Grade   : " + grade);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Object created using constructor
        Student s1 = new Student(name, rollNo, marks);

        s1.calculateAverage();
        s1.calculateGrade();
        s1.displayDetails();

        sc.close();
    }
}


/*
-- HOMEWORK FOR JAVA --
byte code output is in what file ?? ANS -> .class file
it is platform independent -> byte code can run in all OS.
it's pass by value...find why ?
Multiple inheritance ??....why possible or not ?
Only one class can be defined....every class has one source file...as a part of main class
How to achieve functionality of multiple Java files, like we do in C++.
for viva innovative research.
Do on cmd line...do on Windows then copy it on Linux.
Structure of JVM and it's functionality
JRE ??
Concurrency Demonstrate
*/