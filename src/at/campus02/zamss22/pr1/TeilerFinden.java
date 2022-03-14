package at.campus02.zamss22.pr1;

public class TeilerFinden {
    public static void main(String[] args) {
        teilerFinen(88);
    }

    public static int teilerFinen(int z) {
        int Ti = 2;

        while(Ti<z){
        if(z % Ti == 0) {
            System.out.println("Teilern von Zahl " + z + " sind " + Ti);
        }
            Ti= Ti + 1;

        }
        return Ti;

    }
}
