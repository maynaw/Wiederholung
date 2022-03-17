package com.company;

public class KurzWeg {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter the grade: ");
        int grade = s.nextInt();
        String result = (grade>= 50)? "pass" : "fail";
        System.out.println(result);
    }
}
