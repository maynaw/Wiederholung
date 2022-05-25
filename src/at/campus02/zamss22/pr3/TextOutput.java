package at.campus02.zamss22.pr3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextOutput {
    public static void main(String[] args) throws IOException {

        File file = new File("text output.txt");
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println(" FirstLn");
        printWriter.println(" SecondLn");

        printWriter.flush();
        printWriter.close();
        System.out.println("fertig");
    }
}
