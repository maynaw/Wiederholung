package at.campus02.zamss22.orchesterCopy;

public class Orgel extends Instrument {
    public Orgel(String n, int l){
        super(n, l);
    }

    @Override
    public int play() {
        System.out.println("Die Orgel " + name + " pfeift durch die leeren Hallen");
        return lautstaerke;
    }

}
