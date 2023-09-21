import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

    public static void main(String[] args) throws IOException {
        // чтение smallfile.txt из рабочей директории

//        String fileName = "smallfile.txt";
//        FileInputStream fis = new FileInputStream(fileName);

          File file = new File("smallfile.txt");
          FileInputStream fis = new FileInputStream(file);

        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
    }
}
