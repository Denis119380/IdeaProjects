package FileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*  Программа CopyFileNewVersion демонстрирует применение
    оператора try с ресурсами и управление двумя
    ресурсами - двумя файлами
    */
public class CopyFileNewVersion {
    public static void main(String[] args) throws IOException{
        int i;
        if (args.length != 2) {
            System.out.println("Использовать командную строку.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(args[0]);
             FileOutputStream fos = new FileOutputStream(args[1])) {
            do {
                i = fis.read();
                if (i != -1) fos.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
