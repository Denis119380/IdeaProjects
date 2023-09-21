package FilesUse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class DemoFiles {

    public static void main(String[] args) {
        // проверка на существование файла
        boolean exists = Files.exists(Paths.get("src/PathUse/food.txt"));
        System.out.println(exists);

        try {
            // проверка на уникальность файлов(папок)
            boolean as = Files.isSameFile(Paths.get("./src/FilesUse/"),
                    Paths.get("src/PathUse/"));
            System.out.println(as);

            // создание одной директории
//            Files.createDirectory(Paths.get("src/FilesUse/Test"));

            // создание нескольких директорий
//            Files.createDirectories(Paths.get("src/FilesUse/Tesst1/Tesst2"));

            // копирование директории
//            Files.copy(Paths.get("src/FilesUse"),
//                    Paths.get("src/FilesUse/FilesUseSave"));

            // копирование файла
//            Files.copy(Paths.get("src/FilesUse/Test.txt"),
//                    Paths.get("src/FilesUse/FilesUseSave/Test.txt"));

            // перемещение файла или директории
//            Files.move(Paths.get("src/TestPackage"),
//                    Paths.get("src/FilesUse/TestPackageMove"));

            // удаление файлов и директорий
//            Files.delete(Paths.get("src/FilesUse/Test.txt"));
//            Files.deleteIfExists(Paths.get("src/FilesUse/Test.txt"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
