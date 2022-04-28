package at.campus02.zamss22.pr2.hasen;

import java.util.ArrayList;

public class HasenApp {
    public static void main(String[] args) {

        Hase h1 = new Hase("Hansi");
        h1.schlafen();
        h1.fressen();
        h1.hoppeln();

        Osterhase o1 = new Osterhase("nino");
        o1.versteckeOstereier();
        Weihnachtshase w1 = new Weihnachtshase("luci");
        w1.hoppeln();
// let#s try up-and downcasting

        // upcasting osterhase to hase -> specialized type to general type is possible
        Hase h3 = o1;
        h3.hoppeln(); // osterhase implementation is used
        //
        // if we know that htere is a really a osterhase behind -> downcasten
        Osterhase o4 = (Osterhase) h3; // downcasting works
        o4.versteckeOstereier();
// but not always - aweihnacht
        Hase h2 = new Osterhase("susi");
        h2.hoppeln();

        Osterhase o2 = (Osterhase) h2;
        o2.name = "ruri";
        o2.versteckeOstereier();


        Hasenstall hs = new Hasenstall();
        hs.addHase(o2);
        hs.addHase(o1);
        hs.addHase(o4);

        hs.hoppelAll();

        // try around with up and downcasting
        Osterhase o3 = new Osterhase("Mrs.Egg");
        Hase h4 = new Hase("Common rabbit (but cute)");
        Weihnachtshase w2 = new Weihnachtshase("Mr.Snow");

        Weihnachtshase wh;
        Osterhase oh;
        Hase h;

        // vererbungshierarchie
//                                --->_ Osterhase
//         object --> Hase ---
//                                ---->Weihnactshase

        // upcasting : assighing a chld class to a reference of its partent class
        // example:
        // this is Upcasting
        h = o1; // assigh from right (child class Osterhase) to left ( parent class Hase)
        // what is the difference if i acces now my Mrs. Egg via the h Hase referernce
        // -> the versteckeOstereier is missing because we only see attributes and methods
        // already the Hase has ( imagine : we view the Osterhase Mrs.Egg through the lens of a Hase)

        h.hoppeln();
        // why do make this? because of poloymorphism ( think about arraylist)
        h = w2; // up casting

        wh = (Weihnachtshase) h; // Doun casting

// interface example
        ArrayList<GoesToParty> partyPeople = new ArrayList<>();
        partyPeople.add(wh);

        for (GoesToParty p : partyPeople) {
            p.party("alcoholfree champagne", "unicorn cake");
        }
    }
}
