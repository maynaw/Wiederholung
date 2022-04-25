package at.campus02.zamss22.pr2.hasen;

public class Weihnachtshase extends Hase {

    public Weihnachtshase(String name) {
        super(name);
    }

    @Override
    public void hoppeln() {
        System.out.println(name + " wälzt sich durch den Schnees und bringt Geschenke");
    }

    public void verteileGeschenke() {
        System.out.println("Weihnachtshase "+ name + " verteilt Geschenke");
    }

}
