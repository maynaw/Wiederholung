package at.campus02.zamss22.pr3;

import java.io.File;

public class Ue3 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\n51633\\Desktop");
        System.out.println("Original Path: " + dir.getAbsolutePath());
        listsAll(dir.getAbsolutePath());

    }

    public static void listsAll(String path) {
        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;
        for (File f : list) {
            if (f.isDirectory()) {
                //rekursiver Aufruf
                System.out.println("Dir: " + f.getAbsolutePath());
                listsAll(f.getAbsolutePath());
            } else {
                System.out.println("File:" + f.getAbsoluteFile());
            }
        }
    }
}