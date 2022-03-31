package at.campus02.zamss22.pr1.uebungsBeispiele3;

import java.util.Arrays;

public class NumberHelper {
    public static void main(String[] args) {

        int[][] arr = new int[][]{{0, 1, 9}, {6, 3, 2}};
       // getFlatArray(numbers);
       // for (int x = 0; x < numbers.length; x++) {
            System.out.println(Arrays.toString(getFlatArray(arr)));
        }


    public static int[] getFlatArray(int[][] numbers) {
        // this to know who long is our array
        int l = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                l++;
            }
        }
        //this to make a new array which is flat
        int[] arr2 = new int[l];
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                arr2[k] = numbers[i][j];
                k++;
            }
        }
        return arr2;
    }
}


/*
        int i = 0;
        int y = 0;
        int x = 0;
        int output[] = new int[numbers.length];

        while (x < numbers.length) {
            output[i] = numbers[y][x];
            x++;
            i++;
            if (x == numbers.length - 1) {
                y++;
            }
        }
    return output;
        */

