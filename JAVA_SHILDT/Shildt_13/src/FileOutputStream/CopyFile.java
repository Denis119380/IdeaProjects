package FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Копирование файла First.txt в файл Second.txt
// В командной строке ввести: java CopyFile.java First.txt Second.txt
public class CopyFile {
    public static void main(String[] args) throws IOException{
        int i;
        FileInputStream fin = null;
        FileOutputStream fos = null;

        // убедиться, что указаны имена обоих файлов
        if (args.length != 2) {
            System.out.println("Ввести в еомандную строку:" +
                    "java CopyFile.java First.txt Second.txt");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fos = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1) fos.write(i);
            } while (i != 1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода.");
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e2) {
                System.out.println("Ошибка закрытия файла ввода.");
            }
            try {
                if (fos != null) fos.close();
            } catch (IOException e2) {
                System.out.println("Ошибка закрытия файла вывода.");
            }
        }
    }
}
