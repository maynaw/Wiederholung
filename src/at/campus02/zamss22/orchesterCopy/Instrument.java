package at.campus02.zamss22.orchesterCopy;

public abstract class Instrument {
    protected int lautstaerke;
    protected String name;

    public Instrument(String n, int l){
        name = n;
        lautstaerke = l;
    }
    public abstract int play();

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
