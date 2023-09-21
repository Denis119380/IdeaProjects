package FileInputStream;
// Чтобы просмотреть файл Test.txt, нужно ввести в командной
// строке следующую команду: java ShowFile.java Test.txt

// Код в котором открывается файл и чтение данных из файла
// заключён в один блок оператора try.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Файл закрывается в операторе finally
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        // убедиться, что имя файла указано
        if (args.length != 1) {
            System.out.println("Ввести в командную строку: java ShowFile.java Test.txt");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода.");
        } finally {
            // закрыть файл в любом случае
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла.");
            }
        }
    }
}
