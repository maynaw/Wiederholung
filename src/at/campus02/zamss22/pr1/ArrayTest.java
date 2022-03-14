package at.campus02.zamss22.pr1;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        String [] quartale = {"Erühling", "Sommer", "Herbst", "Winter"};

        String qu1 = quartale[0];
        // arrays.tostring erlaubt uns schöne ausgabe - sonst wird objektreferenz ausgeben
        System.out.println(Arrays.toString(quartale));

        System.out.println(qu1);
        quartale[0] = "Fruehling";

        System.out.println(Arrays.toString(quartale));
        System.out.println(qu1);
    }
}
