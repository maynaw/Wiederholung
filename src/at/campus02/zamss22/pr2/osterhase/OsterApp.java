package at.campus02.zamss22.pr2.osterhase;

public class OsterApp {
    public static void main(String[] args) {
        Osterhase dieter = new Osterhase("Dieter", 77, HasenReligion_Enum.ZUR_HEILIGENKAROTTE);
        Osterhase hansi = new Osterhase("Hansi"); // zweiter Konstruktor, hier wird nur der Name benötigt (anzahlVersteckteEier ist lt. Konstruktor dann 0)
//        ohne Konstruktor:
//        dieter.setName("Dieter");
//        dieter.setAnzahlVersteckteEier(77);
//        usw.
        System.out.println(dieter.getName());
        System.out.println(dieter.getAnzahlVersteckteEier());
        System.out.println(dieter.getHaeschenNummer());
        System.out.println("Hansi: " + hansi.getAnzahlVersteckteEier());
        hansi.setAnzahlVersteckteEier(10);
        System.out.println("Hansi: " + hansi.getAnzahlVersteckteEier());
        System.out.println("Hansi Nummer: " + hansi.getHaeschenNummer());
        dieter.setAnzahlVersteckteEier(-3); // macht er nicht, weil if in der methode (keine negativen Zahlen)
        System.out.println(dieter.getAnzahlVersteckteEier());
        // möchte 1 ei zu der bisherigen summe addieren
        dieter.setAnzahlVersteckteEier(dieter.getAnzahlVersteckteEier() + 1);
        System.out.println(dieter.getAnzahlVersteckteEier());
        // toString methode in OsterApp
        System.out.println(dieter);
        System.out.println(hansi);
          /*
        Osterhase dieter = new Osterhase("Dieter (aka Hansi)", 77, HasenReligion_Enum.ZUR_HEILIGENKAROTTE);
        Osterhase marla = new Osterhase("Marla"); // zweiter konstruktor, hier wird nur der Name benötigt (anzahlVersteckteEier ist lt. Konstruktor dann 0)
//        ohne Konstruktor:
//        dieter.setName("Dieter");
//        dieter.setAnzahlVersteckteEier(77);
//        usw.

        System.out.println(dieter.getName());
        System.out.println(dieter.getAnzahlVersteckteEier());
        System.out.println(dieter.getHaeschenNummer());
        System.out.println("Marla: " + marla.getAnzahlVersteckteEier());
        marla.setAnzahlVersteckteEier(10);
        System.out.println("Marla:" + marla.getAnzahlVersteckteEier());
        System.out.println("Marla Nummer: " + marla.getHaeschenNummer());
        dieter.setAnzahlVersteckteEier(-3);// // macht er nicht, weil if in der methode (keine negativen Zahlen)
//        dieter.setName("Dieter (formerly known as Hansi)");
//        dieter.setAnzahlVersteckteEier(5);
        //  System.out.println(dieter.anzahlVersteckteEier);
        System.out.println(marla.getName());
        System.out.println(marla.getAnzahlVersteckteEier());
        // Möchte ein ei zu der bisheerigen summe addieren
        dieter.setAnzahlVersteckteEier(dieter.getAnzahlVersteckteEier() + 1);
        System.out.println(dieter.getAnzahlVersteckteEier());
        // System.out.println(dieter.anzahlVersteckteEier);
        // dieter.anzahlVersteckteEier = -2;
        // System.out.println(dieter.anzahlVersteckteEier);

        System.out.println(dieter);
        System.out.println(marla);

         */

    }
}

