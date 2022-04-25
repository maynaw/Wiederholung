package at.campus02.zamss22.pr2.hasen;
import java.util.ArrayList;
public class Hasenstall {
    private ArrayList<Hase> all;

    public Hasenstall(){
        all = new ArrayList<>();
    }
    public void addHase(Hase h){
        all.add(h);
    }
    public void hoppelAll(){
        for (Hase h : all){
            h.hoppeln();
        }
    }
}
