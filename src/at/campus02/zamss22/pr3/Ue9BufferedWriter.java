package at.campus02.zamss22.pr3;

import java.io.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Ue9BufferedWriter {
    public static void main(String[] args) throws IOException {
/*
        FileWriter fileWriter = new FileWriter("test25-05.txt", UTF_8);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.newLine();
        bufferedWriter.write("zeile1 \n");
        bufferedWriter.write("zeile2");
        bufferedWriter.newLine();
        bufferedWriter.write("zeile3");
        bufferedWriter.newLine();

        bufferedWriter.flush();
        bufferedWriter.close();
 */

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        while (!(line = bufferedReader.readLine()).equals("STOP")){
            System.out.println(line);
        }
        bufferedReader.close();
        System.out.println("closed");
    }
}
