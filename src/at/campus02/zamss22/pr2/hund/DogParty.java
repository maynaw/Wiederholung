package at.campus02.zamss22.pr2.hund;

import at.campus02.zamss22.pr2.neuSortieren.Mitarbeiter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DogParty {
    public static void main(String[] args) {
        Dog scooby = new Dog("ScoobyDoo", "black", 40, true);

        System.out.println(scooby);
        scooby.bark();

//        Dog hund = new Dog();
//        hund.bark();

        Beagle hansi = new Beagle("Hansi", "blue", 80, false, "everything");
        System.out.println(hansi);
        hansi.bark();
/*
        public String name;
        public String eyeColor;
        public int weight;
        public boolean appreciatesDogs;
        */
        List<Dog> dList = new ArrayList<Dog>();
        dList.add(new Dog("tuti", "braun", 40, true));
        dList.add(new Dog("susi", "blau", 30, false));
        dList.add(new Dog("lili", "grün", 20, true));
        dList.add(hansi);
        dList.add(scooby);

        System.out.println(dList);
        Collections.sort(dList);
        System.out.println(dList);


    }
}
