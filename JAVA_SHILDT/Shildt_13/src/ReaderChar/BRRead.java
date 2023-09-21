package ReaderChar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Использование класса BufferedReader для чтения
// символов с консоли
class BRRead {
    public static void main(String[] args) throws
            IOException {
        char c;
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Введите символ, " +
                "'q' - для выхода.");

        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
