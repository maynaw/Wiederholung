package at.campus02.zamss22.pr3;

import java.io.FileWriter;
import java.io.IOException;

public class Ue9FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("test.25-05.txt");

        fileWriter.write("TEST \n");
        fileWriter.write("zeile2");

        fileWriter.flush();
        fileWriter.close();

    }
}
