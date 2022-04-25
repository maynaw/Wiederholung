package at.campus02.zamss22.pr2.hund;

public class Beagle extends Dog {
    public String lovedFood;


    public Beagle(String name, String eyeColor, int weight, boolean appreciatesDogs, String lovedFood) {
        super(name, eyeColor, weight, appreciatesDogs);
        // super(); // calling parent constructor (is done automatically)
        this.lovedFood = lovedFood;
    }

    // here i can overwrite (überschreiben) my method and to my own implementation instead
    // and not the one from one of my base classes


    @Override
    public void bark() {
        // eat(); // we know that we can easily call other methods
        super.bark(); // we use super to reference implementation in the parent class
        super.bark();
    }

}
