package at.campus02.zamss22.pr3;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Ue14_print {
    public static void main(String[] args) throws FileNotFoundException {

        String data = "das ist ein TEst";
        PrintStream output = new PrintStream("test.dat");
        output.print(data);
        output.flush();
        output.println(data);
        output.flush();
        output.close();
    }
}
