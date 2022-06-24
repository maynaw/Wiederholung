package at.campus02.zamss22.pr3;


import java.io.*;

public class Ue13 {
    public static void main(String[] args) throws IOException {
        File file = new File("test25-05.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        int byteRead;
        int character_count = 0;
        int character_count_with = 0;
        while ((byteRead = bufferedInputStream.read()) != -1) {
            character_count_with++;
            if (!Character.isWhitespace((char) byteRead)) {
                System.out.println((char) byteRead);
                character_count++;
            }
        }
        System.out.println(character_count);
        System.out.println(character_count_with);

        bufferedInputStream.close();

    }
}
