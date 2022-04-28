package at.campus02.zamss22.orchesterCopy;

public class Floete extends Instrument {
    public Floete(String n, int l) {
        super(n, l);
    }

    @Override
    public int play() {
        System.out.println("Flöte " + name + " quietscht fast immer richtig");
        return lautstaerke;
    }
}
