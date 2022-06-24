package at.campus02.zamss22.pr3;

import java.io.*;
import java.nio.file.FileVisitResult;

public class Ue7 {
    public static void main(String[] args) throws IOException {
        /*
        File file = new File("test.txt");
        FileReader fileReader = new FileReader(file);
        // FileReader fileReader = new FileReader("text.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();
        fileReader.close();
         */

        File file = new File("C:\\Users\\s51633");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();
        fileReader.close();
    }
}
