package at.campus02.zamss22.pr3;

import java.io.File;
import java.io.IOException;

public class Ue1 {
    public static void main(String[] args) throws IOException {

    /* Create a method, which has a file as parameter
    The method should print the following information of a file on the console:
    - Does this file exist?
    - Name of the File
    - Parent Directory of the File
    - Path to this File
    - Is this a directory?
    - Is this a file?
    - Is this file readable?
    - Is this File writeable
    - File Size
     */
        File dir = new File("C:\\");
        printInformation(dir);
    }

    public static void printInformation(File file) {

        System.out.println(file.getName());
        System.out.println(file.exists());
        System.out.println(file.getParentFile());
        System.out.println(file.getPath());
        System.out.println(file.isDirectory());

    }
}
