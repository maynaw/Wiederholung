package at.campus02.zamss22.pr2.hund;

public class Dog {
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
}
