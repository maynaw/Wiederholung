package uebungsBeispiele3;

public class SchleifenPart2Durch3Teilbar {
    public static void main(String[] args) {
        for (int zahl = 1; zahl<101; zahl++){
            if (zahl%3 == 0){
                System.out.println(zahl);
            }
        }
    }
}
