package at.campus02.zamss22.pr1;

public class Tamagochi {

    int x;
    int y;
    int futterstand;

    void fuettern(int zusatzFutter) {
        futterstand = futterstand + zusatzFutter;
    }

    public void bewegen(String richtung, int schritte) {
        while (futterstand > 0 && schritte > 0) {
            if (richtung.equals("oben")) {
                ++y;
            } else if
            (richtung.equals("unten")) {
                --y;
            } else if (richtung.equals("links")) {
                --x;
            } else if (richtung.equals("rechts")) {
                ++x;
            }
            --schritte;
            --futterstand;
        }
    }

    public static void main(String[] args) {
        Tamagochi neon = new Tamagochi();
        neon.x = 6;
        neon.y = 4;
        neon.futterstand = 5;

        neon.bewegen("links", 6); // wir hoffen, dass es 6 geht aber wird wohl nur 5 schritte
        neon.fuettern(5);
        neon.bewegen("links", 1);
        neon.bewegen("unten", 4);
        System.out.println(neon.x + " " + neon.y);


    }
}
    /*
    static int schritten;
    static String richtung;


    public static bewegen( schritten, richtung){
        System.out.println("Tamagochi geht nach " + richtung + schritten + " Schritten");
    }
    public static futterGeben(int futter){
       // for (int i = 0; i <= schritten; i++){
        while (schritten +=1){
           futter -= 1;
        System.out.println("Futter ist = " + futter);

        }
    }

 */

