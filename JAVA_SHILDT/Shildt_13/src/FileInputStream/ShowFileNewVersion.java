package FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// В этой версии программы ShowFile
// оператор try с ресурсами применяется для
// автоматического закрытия файла
class ShowFileNewVersion {
    public static void main(String[] args) {
        int i;
        if (args.length != 1) {
            System.out.println("Использовать командную строку");
            return;
        }
        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода.");
        }
    }
}
