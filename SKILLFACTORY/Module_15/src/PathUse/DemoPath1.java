package PathUse;

import java.nio.file.Path;
import java.nio.file.Paths;

class DemoPath1 {

    public static void main(String[] args) {
        printPathInformation(Paths.get(
                "/zoo/armadillo/shells.txt"));
        System.out.println();
        printPathInformation(Paths.get(
                "armadillo/shells.txt"));
    }

    public static void printPathInformation(Path path) {
        System.out.println("Filename is: "+
                path.getFileName());
        // обратить внимание как метод getRoot() работает
        // для абсолютного и относительного пути
        System.out.println("Root is: " + path.getRoot());

        Path currentPath = path;
        while ((currentPath = currentPath.getParent())
        != null) {
            System.out.println("Current parent is: "
            + currentPath);
        }
    }
}
