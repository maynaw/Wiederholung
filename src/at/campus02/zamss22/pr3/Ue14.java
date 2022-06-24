package at.campus02.zamss22.pr3;

import java.io.*;

public class Ue14 {
    public static void main(String[] args) throws IOException {
        File file = new File("text-binary.dat");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        String outputTExt = "Das ist ein neuer Test";

        for (char c : outputTExt.toCharArray()){
            bufferedOutputStream.write(c);
            System.out.println(c);
        }
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
}
