package at.campus02.zamss22.pr1.uebungsbeispiele4;

public class DemoStrafe {
    public static void main(String[] args) {
Strafe person1 =new Strafe();
person1.vorname = "jad";
person1.nachname = "div";
person1.kennzeichen = "ks98573970";
person1.strafnummer = 324423;
person1.strafe(50);
person1.verbandspaket();
person1.alkohol(0.1);
person1.sonstiges(0);
        System.out.println(person1.strafe);
        System.out.println(person1.anzahl);
        System.out.println(person1.getStrafe());
    }
}
