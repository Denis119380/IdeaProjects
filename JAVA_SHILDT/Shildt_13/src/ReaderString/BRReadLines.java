package ReaderString;

// Чтение символьных строк с консоли средствами
// класса BufferedReader

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BRReadLines {
    public static void main(String[] args) throws
            IOException {

        // создать поток ввода типа BufferedReader
        // используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String str;
        System.out.println("Введите строки текста.");
        System.out.println("Введите 'stop' для завершения");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
