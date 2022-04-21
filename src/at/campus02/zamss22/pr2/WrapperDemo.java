package at.campus02.zamss22.pr2;

public class WrapperDemo {
    public static void main(String[] args) {
        // aufgrund von autoboxing können int und Integer stellvertretend verwenden werden
        Integer i = 22;
        int j = new Integer(27);
        Integer k = null;

        System.out.println(j);
        System.out.println(i);
        int l = Integer.parseInt("16"); // fuer kommazahl bei Double. schauen
        System.out.println(("16" + 2));
        System.out.println((l + 2));
    }
}
