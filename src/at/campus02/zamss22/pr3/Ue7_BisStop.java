package at.campus02.zamss22.pr3;

import java.io.*;

public class Ue7_BisStop {
    public static void main(String[] args) throws IOException {
        //Ready to receive user Input
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            // check if the input is STOP
            if (line.equals("STOP")) {
                // if yes, go out of the while loop
                break;
                //another way
                /*
                while (!(line = bufferedReader.readLine()).equals("STOP")){
                System.out.print(line);
                 */
            }
        }
    }
}

