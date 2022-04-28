package at.campus02.zamss22.pr2.orchesterBeispiel;

public class Main {
    public static void main(String[] args) {
        Gitarre g = new Gitarre("Roberto", 10);
        Floete f = new Floete("Hansi", 8);
        Orgel o = new Orgel("Orgelito", 14);

        Orcherster or = new Orcherster();

        or.addInstrument(g);
        or.addInstrument(f);
        or.addInstrument(o);
        or.playAll();
    }
}
