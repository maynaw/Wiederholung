package at.campus02.zamss22.pr2.orchesterBeispiel;

import java.util.ArrayList;

public class Orcherster {
    private ArrayList<Instrument> or;

    public Orcherster(){
        or = new ArrayList<>();
    }

    public void addInstrument(Instrument i){
        or.add(i);
    }

    public int playAll(){
        int summe = 0;
        for (Instrument i : or){

            summe +=  i.play(); // i.lautstaerke geht hier auch weil im gleichen
        }
        return summe;
    }
}
