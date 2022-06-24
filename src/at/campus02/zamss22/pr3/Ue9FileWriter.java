package at.campus02.zamss22.pr3;

import java.io.*;

public class Ue9FileWriter {
    public static void main(String[] args) throws IOException {
        /*
        FileWriter fileWriter = new FileWriter("test.25-05.txt");

        fileWriter.write("TEST \n");
        fileWriter.write("zeile2");

        fileWriter.flush();
        fileWriter.close();
         */

        FileWriter fileWriter = new FileWriter("Ue9dateiErstellt.txt");
        //BufferedReader bufferedReader = new BufferedReader(fileWriter);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        String data = "Das ist ein Test";
        String newLine = "";
        printWriter.println(data);
        printWriter.println(data);
        printWriter.println();
        printWriter.println(data);
        printWriter.flush();
        printWriter.close();
        System.out.println("Fertig");
    }
}
