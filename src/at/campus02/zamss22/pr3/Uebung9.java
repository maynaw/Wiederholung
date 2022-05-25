package at.campus02.zamss22.pr3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Uebung9 {

    public static void main(String[] args) throws IOException {
        File file = new File("25-05.txt");
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        String java = "ffff";
        printWriter.println("Zeile 1");
        printWriter.println("Zeile 2");
        printWriter.println("ohneLN");
        printWriter.println("ohneLN");
        printWriter.println("Zeile 3");
        printWriter.println("Zeile 4");
        printWriter.format("This is a %s program with %d MB", java, 100);
        printWriter.println("This is a " + java + " program with 100 MB");

        printWriter.flush();
        printWriter.close();
        System.out.println("Schreiben FERTIG");
    }
}
