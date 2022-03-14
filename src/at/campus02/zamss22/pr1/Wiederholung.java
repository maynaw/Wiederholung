package at.campus02.zamss22.pr1;

public class Wiederholung {
    public static void main(String[] args) {
        int a = 0, b = 1;
        String s = "Hansi";

        System.out.println(a);
        System.out.println(b);

        //Suchen in String s nach dem ersten Vorkommen der Position a
        int position = s.indexOf('a');
        System.out.println(position);

        double d = 100.0;
        double d2 = 0.1;
        double d3 = 0.00000000001;
        double d4 = 100000000000000.0;
        System.out.println(d+ d2);
        System.out.println(d + d3);

        // unterschied post und prä inkrement bzw. dekrement
        a = 1;
        int c;

        ++a; // wir erwarten 2
        System.out.println(a);

        c = ++a; // wir erwarten überall 3
        System.out.println("a:" + a + "c:"  + c);

        c = a++; // wir erwarten ???
        System.out.println("a:" + a + "c:"  + c);

        myLittleHelper("Santa Clause");
        myLittleHelper(s);
        //das hat nichts damit zu tun aber nur als beispiel
        String helper = "Batman";
        myLittleHelper(helper);

    }
    public static void myLittleHelper(String helper){
        System.out.println("I am the little helper " + helper);

    }
}
