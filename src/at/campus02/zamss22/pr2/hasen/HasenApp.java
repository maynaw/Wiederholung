package at.campus02.zamss22.pr2.hasen;

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
    }
}
