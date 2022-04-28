package at.campus02.zamss22.orchesterCopy;

public class Gitarre extends Instrument {
    public Gitarre(String n, int l){
        super(n, l);
    }

    @Override
    public int play() {
        System.out.println("Gitarre " + name + " lässt ihre Saiten klingen");
        return lautstaerke;
    }


}
