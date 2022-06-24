package at.campus02.zamss22.pr3;

import java.io.*;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Uebung10 {

    public static void main(String[] args) throws IOException {
/*
        File f = new File("mein Noten");
        FileWriter fileWriter = new FileWriter(f);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        System.out.println("Please, write your subjects with your Note one by one ");

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        while (!(line = bufferedReader.readLine()).equals("stop")){

            printWriter.println(line);
            System.out.println(line);
        }
        bufferedReader.close();

        printWriter.flush();
        printWriter.close();
        System.out.println("Datei erzeugt");
 */

        File file = new File("test10.txt");
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        System.out.println("bitte geben Sie ihr Fach sowie Noten ein");

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        while (!(line = bufferedReader.readLine()).equals("STOP")){
            printWriter.println(line);
            System.out.println(line);
        }
        bufferedReader.close();
        printWriter.flush();
        printWriter.close();
    }


}
