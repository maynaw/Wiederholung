package at.campus02.zamss22.pr2.logisticManager;

public class Main {
    public static void main(String[] args) {
        LogisticManager hansi = new LogisticManager();

       // hansi.add(new Shirt("HansiWear", "L", "snowwhite"));
        Shirt s = new Shirt("HansiWear", "L", "snowwhite");
        hansi.add(s);
        hansi.add(new Car("Mercedes PUCH G", "military green", 3000));

        hansi.moveAll("Schladming");
    }
}
