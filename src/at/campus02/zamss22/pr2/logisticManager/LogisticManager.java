package at.campus02.zamss22.pr2.logisticManager;

import java.util.ArrayList;

public class LogisticManager {
    private ArrayList<Moveable> list;

    public LogisticManager(){
        list = new ArrayList<>();
    }
    public void add(Moveable m){
        list.add(m);
    }
    public void moveAll(String destination){
        for (Moveable m : list){
            m.move(destination);
        }
    }
}
