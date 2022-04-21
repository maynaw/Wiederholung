package at.campus02.zamss22.pr2;

import at.campus02.zamss22.pr2.himmelsrichtungUebung.Himmelsrichtung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SerialKillers {

    // als angehende*r neuer serienkiller*in ( damit sind keine bösartigen personen gemeint sondern personen
    // die sehr gerne und sehr viele serien schauen) möchten sie auch wirklich in die geschichtsbücher
    // eingehen und deshalb wollen wir sicherstellen, dass ihr neverr name auch wirklich eindeutig ist
    public static void main(String[] args) {
        HashSet<String> serialNicknames = new HashSet<>();

        serialNicknames.add("Ted Bundy");
        serialNicknames.add("Hannibal Lecter");
        serialNicknames.add("Zodiac Killer");

        for (String s : serialNicknames) {
            System.out.println(s);
        }

        System.out.println(serialNicknames.add("Ted Bundy"));
        System.out.println(serialNicknames.add("Edmund Kemper"));
        System.out.println(serialNicknames.add("Jack the Ripper"));

        for (String s : serialNicknames) {
            System.out.println(s);

        }

        // serialNicknames.retain
        // zweites set nur für amerikaner*innen
        HashSet<String> americanSerialKiller = new HashSet<>();
        americanSerialKiller.add("Ted Bundy");
        americanSerialKiller.add("Edmund Kemper");
        americanSerialKiller.add("Hannibal Lecter");
        serialNicknames.retainAll(americanSerialKiller);
        System.out.println("---------------");

        for (String s : serialNicknames) {
            System.out.println(s);
        }
// hausaufgabe: the it  crowd schauen :)
// zurueck zur hashmap
        // in einer hashmap möchten wir alle opfer unserer serienkiller speichern
        HashMap<String, ArrayList<String>> opfer = new HashMap<>();
        // wenn ich hier (und nicht in for schleife) die arraylist erzeuge
        // dann habe ich insgesamt nur eine arraylist und würde jedem serienkiller
        //
        for (String crazyAmerican: americanSerialKiller){
            ArrayList<String> o = new ArrayList<>();
            o.add("Opfer 1");
            o.add("Opfer 2");
            o.add("Opfer 3");

            opfer.put(crazyAmerican, o); // jeder serienkiller hat eine eigene opferliste (die zufällig de
        }
        // wie kann ich denn jetzt ein oopfer hinzufügen
        // ganze einfach -> in dem wir ein opfer in die opferliste hinzufügen
        //doch nicht ganz einfach -> wie kommen wir zu unserer Opferliste?
        //
        ArrayList<String> opfi = opfer.get("Ted Bundy");

        opfi.add("Opfer 4");


    }
}
