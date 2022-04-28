package at.campus02.zamss22.pr2.orchesterBeispiel;

public class Instrument {
    protected int lautstaerke;
    protected String name;

    public Instrument(String n, int l){
        name = n;
        lautstaerke = l;
    }
    public int play(){
        System.out.println(name + " ist " + lautstaerke + " laut.");

        return lautstaerke;
    }

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
