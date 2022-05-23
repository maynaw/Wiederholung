package at.campus02.zamss22.pr3;

import java.io.IOException;
import java.io.StringReader;

public class Ue7_stringReader {
    public static void main(String[] args) throws IOException {
        String text = "Hallo dads ist ein TEst";

        StringReader stringReader = new StringReader(text);
        int c;
        while ((c = stringReader.read()) != -1){
            System.out.print((char)c);
        }
        stringReader.close();
    }
}
