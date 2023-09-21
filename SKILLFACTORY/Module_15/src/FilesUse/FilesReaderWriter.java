package FilesUse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class FilesReaderWriter {
    public static void main(String[] args) {

        Path path = Paths.get("src/FilesUse/Hello.txt");
        try (BufferedReader reader = Files.newBufferedReader(path,
                StandardCharsets.US_ASCII)) {
            String currentLine = null;
            while ((currentLine = reader.readLine()) != null)
                System.out.println(currentLine);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path path2 = Paths.get("src/FilesUse/HelloWorld.txt");
        List<String> data = new ArrayList<>();
        try (BufferedWriter writer = Files.newBufferedWriter(path2,
                Charset.defaultCharset())){
            writer.write("Hello World! The best weather now!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
