package at.campus02.zamss22.pr1.projekt1;

public class NumberTest {
    public static void main(String[] args) {
        // wie komme ich zum jahrzehnt eines alters
        // 25 ->2; 73 -> 7;.....
        int age= 25;
        int zehnerStelle = age / 10;
        System.out.println(zehnerStelle);
        // wie komme ich zur zehner stelle in einer zahl - also bei 137 -> 3; oder 849 -> 4

        //zuerst durch 10 damit wir 7 verschwinden lassen - und dann modulo 10 für die aktuell letzte stelle
        int zehnerstelle = (137 / 10)%10; // eine int division da beide zahlen ohne kommastelle
        System.out.println(zehnerstelle);

    }
}
