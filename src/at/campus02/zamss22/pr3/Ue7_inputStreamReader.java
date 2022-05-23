package at.campus02.zamss22.pr3;

import java.io.*;

public class Ue7_inputStreamReader {
    public static void main(String[] args) throws IOException {
        InputStream stream = new FileInputStream("test.txt");
        Reader reader = new InputStreamReader(stream);

        int c;
        while ((c = reader.read()) != -1){
            System.out.print((char) c);
        }
        reader.close();
    }
}
