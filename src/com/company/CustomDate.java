package com.company;

public class CustomDate {
    public static void main(String[] args) {
        java.util.Date dt = new java.util.Date();
        java.text.SimpleDateFormat myF = new java.text.SimpleDateFormat("dd.MM.yy hh:mm:ss a");
        System.out.println(myF.format(dt));
    }
}
