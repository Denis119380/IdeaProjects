package PathUse;

import java.nio.file.Path;
import java.nio.file.Paths;

class DemoPath {

    public static void main(String[] args) {

        Path path = Paths.get("/land/hippo/harry.happy");
        System.out.println("The path name is: " + path);

        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println("Element " + i + " is: "
            + path.getName(i));
        }
    }
}
