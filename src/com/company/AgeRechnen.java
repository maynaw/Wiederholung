package com.company;

public class AgeRechnen {
    public static void main(String[] args) {
        System.out.println("enter your name");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("welcome " + name);
        System.out.println("enter your age");
        int age = scanner.nextInt();
        System.out.println("your age is " + age);

    }
}
