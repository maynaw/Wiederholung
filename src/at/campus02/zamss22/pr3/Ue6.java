package at.campus02.zamss22.pr3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Ue6 {
    public static void main(String[] args) throws IOException {

        File dir = new File("C:\\Users\\s51633\\Desktop\\Neuer Ordner");
//        createFiles(dir);
//        rename_files(dir);
        delete_files(dir);
    }
/*
    public static void createFiles(File directory) throws IOException {
        for (int i = 1; i <= 10; i++) {
            File myObj = new File(directory.getAbsolutePath() + "//" + ThreadLocalRandom.current().nextInt() + ".mp3");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        }
    }

    public static void rename_files(File directory) {

        if (directory.isDirectory()) { // make sure it's a directory
            for (File oldFile : directory.listFiles()) {
                File newfile = new File(oldFile.getParent() + "\\1_" + oldFile.getName());

                if (oldFile.renameTo(newfile)) {
                    System.out.println("Rename: " + oldFile.getAbsolutePath() + "to " + newfile.getAbsolutePath());
                } else {
                    System.out.println("sorry! the file can't be renamed");
                }
            }
        }
    }

 */

    public static void delete_files(File directory) {
        File filesList[] = directory.listFiles();
        for (File file : filesList) {
            if (file.isFile()) {
                file.delete();
            } else {
                delete_files(file);
            }
        }
    }
}