package at.campus02.zamss22.pr2.orchesterBeispiel;

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
