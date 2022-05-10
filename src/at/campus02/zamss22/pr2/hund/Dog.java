package at.campus02.zamss22.pr2.hund;

import at.campus02.zamss22.pr2.neuSortieren.Mitarbeiter;

public class Dog implements Comparable<Dog> {
    public String name;
    public String eyeColor;
    public int weight;
    public boolean appreciatesDogs;

//    public Dog(){
//        this.name = "Hund";
//        this.eyeColor = "black";
//        this.weight = 17;
//        this.appreciatesDogs = true;
//    }

    public Dog(String name, String eyeColor, int weight, boolean appreciatesDogs) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.appreciatesDogs = appreciatesDogs;
    }

    public void bark() {
        System.out.println(name + " bellt");
    }
    public void eat(){
        System.out.println(name + " eats");
        bark();
    }

    @Override
    public String toString() {
        String text = null;
        if (appreciatesDogs) {
            text = name + " admires other dogs with their sparkly " + eyeColor + " eyes";
        } else {
            text = name + " barks until all other dogs leave the party";
        }
        return text;
    }
// sort with two criteria:
    // first criteria is name
    // second criteria is weight
    @Override
    public int compareTo(Dog o) {
        // first name
        int ergFirst = this.name.compareTo(o.name);
        if (ergFirst != 0){
            return ergFirst; // so we either have positive or negative value
        }
        // second: weight
        if (this.weight < o.weight) {
            return -1;
        }
        if (this.weight > o.weight){
            return 1;
        }
        return 0;
    }
}
