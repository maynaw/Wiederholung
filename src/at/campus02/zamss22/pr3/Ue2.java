package at.campus02.zamss22.pr3;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Dictionary;

public class Ue2 {
    public static void main(String[] args) throws IOException {
        // write a program, which lists all files / directories of the given directory (without sub directories)
        File dir = new File("C:\\");
                listf(dir.getAbsolutePath());
    }

    public static void listf(String path)  {
        File root = new File(path);
        File[] list = root.listFiles();

        for (File f : list){
            if ( f.isDirectory()) {
                System.out.println("Dir: " +  f.getAbsoluteFile());
            }else {
                System.out.println("File:" + f.getAbsoluteFile());
            }
        }

    }

}