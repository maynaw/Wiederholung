package at.campus02.zamss22.pr3;

import java.io.IOException;
import java.io.StringWriter;

public class Ue9StringWriter {
    public static void main(String[] args) throws IOException, IOException {

        String data = "this is a new data";

        StringWriter stringWriter = new StringWriter();
        stringWriter.write(data + "\n");
        stringWriter.write("Hi!");
        stringWriter.flush();
        stringWriter.close();
        System.out.println(stringWriter);
    }
}

