package at.campus02.zamss22.pr1.uebungsBeispiele3;

public class CalcFaculty {
    public static void main(String[] args) {
        long value = calcFaculty(5);
    }

    public static long calcFaculty(int value) {
        for (int zahl = 1; zahl <= value; ++zahl) {
            System.out.println(zahl);
            value *= zahl;
        }
        System.out.println("Fakultät ist " + value);
        return value;


    }
}