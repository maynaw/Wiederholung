package at.campus02.zamss22.pr2.hund;

public class DogParty {
    public static void main(String[] args) {
        Dog scooby = new Dog("ScoobyDoo", "black", 40, true);

        System.out.println(scooby);
        scooby.bark();

//        Dog hund = new Dog();
//        hund.bark();

        Beagle hansi = new Beagle("Hansi", "blue", 80,false, "everything");
        System.out.println(hansi);
        hansi.bark();
    }
}
