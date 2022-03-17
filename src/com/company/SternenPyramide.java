package com.company;

public class SternenPyramide {
    public static void main(String[] args) {
        for (int sps = 4, stern = 1; sps >= 0; sps--, stern += 2) {
            for (int x = 0; x < sps; x++) {
                System.out.print(" ");
            }
            for (int x = 0; x < stern; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int sps = 0, stern = 9; stern>=1; sps++, stern-= 2){
            for (int x = 0; x < sps; x++){
                System.out.print(" ");
            }
            for (int x = 0; x<stern; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
