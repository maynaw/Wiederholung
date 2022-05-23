package at.campus02.zamss22.pr3;

import java.io.File;

public class Ue5 {
    public static void main(String[] args) {
        /*- It should also be checked, if the given directory has been created -> print it to the console:
-> IF Yes: Directory C:\campus02\test\demo4 created?: false
-> IF No: Directory C:\campus02\test\demo4 created?: true
*/

        File dir = new File("C:\\campus02\\test\\demo4");
        createDirectories(dir);
    }

    public static void createDirectories(File f) {
        // check if file is a file or directory
        if(f.isDirectory()){
            // perform mkdirs to try creat
            System.out.println("Directory "+ f.getAbsolutePath() + "created?: " + f.mkdirs());
        } else {
            System.out.println("Directory "+ f.getAbsolutePath() + "created?: " + f.mkdirs());

        }

    }
}
