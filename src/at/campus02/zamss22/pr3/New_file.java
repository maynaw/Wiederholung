package at.campus02.zamss22.pr3;

import java.io.File;
import java.io.IOException;

public class New_file {
    public static void main(String[] args) throws IOException {

        String fileSeparator = System.getProperty("file.separator");
        System.out.println("File Separator: " + fileSeparator);


        File file = new File("C:\\Users\\s51633\\Desktop\\test.txt");
        File file2 = new File("C:"+fileSeparator+"Users"+fileSeparator+"Desktop"+fileSeparator+"s51633"+fileSeparator+"test.txt");

        File html = new File("test.html");

        if (file.createNewFile()) {
            System.out.println("new file");
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getAbsoluteFile());
        } else {
            System.out.println("already exists");

        }
    }
}
