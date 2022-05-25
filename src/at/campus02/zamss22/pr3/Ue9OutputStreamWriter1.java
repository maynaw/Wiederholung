package at.campus02.zamss22.pr3;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.chrono.IsoChronology;

public class Ue9OutputStreamWriter1 {
    public static void main(String[] args) throws IOException {

        String data = " ä ö EXAMPLE - example";

        FileOutputStream fileOutputStream = new FileOutputStream("test1111.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);

        outputStreamWriter.write(data);
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }
}
