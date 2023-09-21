package PathUse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class DemoPath4 {

    public static void main(String[] args) {
        try {
//            System.out.println(Paths.get("Demo\\food.source").toRealPath());
            System.out.println(Paths.get("./src/PathUse").toRealPath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
