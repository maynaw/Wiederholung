package at.campus02.zamss22.pr1;

public class DebugTest {
    public static void main(String[] args) {
        hansiSingt("1000 Träume");
        int x = 5;
        System.out.println(x + " Punkte");
        hansiSingt("Nur du allein");
        hansiSingt("Wann sehen wir uns wieder");
        hansiSingtViel("Wo bist du", 5);

    }

    public static void hansiSingt(String title) {
        System.out.println("Hansi sing " + title);
    }
    public static void hansiSingtViel(String title, int wieOft) {
        for (int i = 0; i < wieOft; ++i){
            System.out.println("Hansi sing " + title);

        }
    }
}
