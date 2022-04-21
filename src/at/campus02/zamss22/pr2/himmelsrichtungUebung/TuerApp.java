package at.campus02.zamss22.pr2.himmelsrichtungUebung;

public class TuerApp {
    public static void main(String[] args) {
        Tuer Nr1 = new Tuer(120, 200, Himmelsrichtung.NORDEN);
        System.out.println(Nr1);
        // neue Richtung setzen
        Nr1.setOeffnungsRichtung(Himmelsrichtung.SUEDEN);
        System.out.println(Nr1);
    }
}