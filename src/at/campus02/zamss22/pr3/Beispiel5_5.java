package at.campus02.zamss22.pr3;

import java.io.*;

public class Beispiel5_5 {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\campus02\\test.txt");
        FileReader fileReader = new FileReader((file));
        /*
        BufferedReader bufferedReader = new BufferedReader(fileReader);
BfferedReader bufferedREader = new BufferedReader....
        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();

         */
        int c;
        while ((c = fileReader.read()) != -1){
            char character = (char) c;
            System.out.print(character);// all character on one line so we will becomme the text line by line.
          //  System.out.println(character);// we will get each character on anther line
            //System.out.println(c); // gibt uns die Zahl von character. give us the number of character.
        }
        fileReader.close();
    }
}
