package UsingTryAndCatch;

import java.util.Random;

public class HandleError {

    public static void main(String[] args) {
        // обработать исключение и продолжить работу

        int a = 0, b = 0, c = 0;
        Random r = new Random(); // создание экземпляра класса Random
                                 // генерирует поток псевдослучайных чисел

        for (int i = 0; i < 10; i++) {
            try { // отслеживание ошибок
                b = r.nextInt(); // метод возвращает псевдослучайное
                c = r.nextInt(); // целочисленное значение (может отрицательное)
                a = 12345 / (b / c);
            } catch (ArithmeticException e) { // перехват исключения (ошибки)
                                              // с указанием типа исключения
                System.out.println("Исключение: " + e); // вывод описания исключения
                System.out.println("Деление на нуль.");
                a = 0; // присвоить нуль и продолжить работу
            }
            System.out.println("a: " + a);
        }

    }
}
