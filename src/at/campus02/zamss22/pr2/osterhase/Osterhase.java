package at.campus02.zamss22.pr2.osterhase;

public class Osterhase {
    private int anzahlVersteckteEier;
    private String name;

    public Osterhase(String name, int anzahlVersteckteEier) {
        this.name = name;
        this.anzahlVersteckteEier = anzahlVersteckteEier;
    }

    public Osterhase(String name) {
        this.name = name;
        this.anzahlVersteckteEier = 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void aendereAnzahlEier(int anzahlVersteckteEier) {
//        // ich kann sicherstellen, dass kein blödsinn gemacht werd
//        if (anzahlVersteckteEier >= 0) {
//
//            // lokale variablen oder parameter mit gleichem namen werden bevorzugt
//            // anzahlVersteckteEier --> parameter
//            // this referenz zeigt auf die aktuelle instanz
//            this.anzahlVersteckteEier = anzahlVersteckteEier;
//        }
//    }
//
//    // methoden überladen - unterscheidet sich durch typ/ anzahl der parameter
//    // hier haben wir eine ohne Parameter -> dann soll Osterhase ein Dutzend Eier verstecken
//    public void aendereAnzahlEier() {
//        anzahlVersteckteEier = 12;
//        // this.anzahl ... ware möglich aber nicht not wendig, da keine namensgleichheit
//    }

    public int gibMirAnzahlDerVersteckteEier() {
        return anzahlVersteckteEier;
    }

    public int getAnzahlVersteckteEier() {

        return anzahlVersteckteEier;
    }

    public void setAnzahlVersteckteEier(int anzahlVersteckteEier) {
        if (anzahlVersteckteEier >= 0) {
            this.anzahlVersteckteEier = anzahlVersteckteEier;
        }
    }
}
