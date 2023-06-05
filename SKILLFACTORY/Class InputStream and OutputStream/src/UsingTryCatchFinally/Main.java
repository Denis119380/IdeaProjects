package UsingTryCatchFinally;

import java.io.*;
import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args) {
        if (copyFileUsingStream("src/UsingTryCatchFinally/win1251.txt",
                "windows-1251",
                "src/UsingTryCatchFinally/utf8.txt",
                "utf-8")) {
            System.out.println("Перекодировка прошла успешно.");
        }
    }

    private static boolean copyFileUsingStream(
            String sourceFilename,
            String sourceEnc,
            String destFilename,
            String destEnc
    ) {
        Reader fis = null; // объект класса Reader
        Writer fos = null; // объект класса Writer
        try { // отслеживание исключений в считываемом потоке
            fis = new InputStreamReader(new FileInputStream(
                    new File(sourceFilename)), sourceEnc);
        } catch (FileNotFoundException e) {
            // обработчик FileNotFoundException исключения
            // в случае перехвата, выводит сообщение и
            // возвращает false
            System.out.println("Файл-источник не найден.");
            return false;
        } catch (UnsupportedEncodingException e) {
            // обработчик UnsupportedEncodingException исключения
            // в случае перехвата, выводит сообщение и
            // возвращает false
            System.out.println("Указана неизвестная кодировка.");
            return false;
        }
        try { // отслеживание исключений в записываемом потоке
            fos = new OutputStreamWriter(new FileOutputStream(
                    new File(destFilename)), destEnc);
        } catch (UnsupportedEncodingException e) {
            // обработчик UnsupportedEncodingException исключения
            // в случае перехвата, выводит сообщение и
            // возвращает false
            System.out.println("Указана неизвестная кодировка.");
            return false;
        } catch (IOException e) {
            // обработчик IOException исключения
            // в случае перехвата, выводит сообщение и
            // возвращает false
            System.out.println("Ошибка ввода-вывода");
            return false;
        }

        char[] buffer = new char[1024]; // массив используется типа char
        int length;
        try {
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (IOException ex) {
            System.out.println("При копировании возникла ошибка");
            return false;
        }
        finally {
            try {
                fis.close(); // при закрытии входных и выходных потоков также
                fos.close(); // возможны исключения
            } catch (IOException ex) {
                System.out.println("Закрыть потоки не удалось");
                return false;
            }
        }
        return true; // исключения не выявлены, файл скопирован, возврат true
    }
}
