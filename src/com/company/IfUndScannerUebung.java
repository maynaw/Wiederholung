package com.company;

public class IfUndScannerUebung {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = s.nextInt();
        System.out.println("Enter the second number");
        int num2 = s.nextInt();

        if (num1 < num2) {
            System.out.println("The first number is smaller than the second number");
        } else {
            System.out.println("The second number is smaller than the first number");
        }
    }
}
