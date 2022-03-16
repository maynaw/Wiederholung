package uebungsBeispiele3;

public class ZahlenSchleifen {
    public static void main(String[] args) {
        for (int zahl =1; zahl<101; zahl++){
            System.out.println(zahl);

        }
        System.out.println("----");
        int zahl = 0;
        while (zahl<100){
            zahl = zahl + 1;
            System.out.println(zahl);
        }
    }
}
