package at.campus02.zamss22.pr2.osterhase;

public class OsterApp {
    public static void main(String[] args) {
        Osterhase dieter = new Osterhase("Dieter (aka Hansi)", 77);
        Osterhase marla = new Osterhase("Marla");

        System.out.println(dieter.getName());
        System.out.println(dieter.getAnzahlVersteckteEier());

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
    }
}
