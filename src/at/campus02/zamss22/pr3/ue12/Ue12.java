package at.campus02.zamss22.pr3.ue12;

import java.io.*;

public class Ue12 {
    public static void main(String[] args) throws IOException {
        File file = new File("test25-05.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        int byteRead;
        while ((byteRead = bufferedInputStream.read()) != -1){
            System.out.println((char) byteRead);
        }

    }
}
