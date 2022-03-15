package at.campus02.zamss22.pr1;

public class FlaechenApp {
    public static void main(String[] args) {
        Punkt a = new Punkt();
        Punkt b = new Punkt();
        Punkt c = a;
        System.out.println(a.x + " " + a.y);
        a.aenderePosition(1, 2);
        System.out.println(a.x + " " + a.y);
        System.out.println(a.x + " " + a.y);
        // da a und c beides Referenzen sind auf das gleiche Punkt Objekt zeigen
        if (a == c) {
            System.out.println("a und c zeigen auf gleiche Punkt Instanz");
        }
        //System.out.println(b);
    }
}
