package at.campus02.zamss22.pr3;

import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

public class Create_directory2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Directory Path where new folder should be created");
        String path = scanner.next();
        System.out.println("Enter the name of the NEW Directory");


        path = path = scanner.next();
        System.out.println("New Directory : " + path);

        File file = new File(path);
        boolean created = file.mkdirs();

        if (created){
            System.out.println("Directory has been created");
        }else {
            System.out.println("Directory has NOT been created");
        }
    }

}
