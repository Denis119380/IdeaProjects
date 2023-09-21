package VisualVMUse;

import java.util.LinkedList;
import java.util.List;

public class STWExample {
    public static void main(String[] args) {
        // поток, временно выделяющий и освобождающий ~100Mb памяти
        Thread t1 = new Thread(() -> {
            while (true) {
                List<byte[]> bytes = new LinkedList<>();
                for (int i = 0; i < 100; i++) {
                    bytes.add(new byte[1024 * 1024]);
                    sleep(20);
                }
            }
        });

        // поток, выводящий в консоль время, прошедшее
        // за время секундной паузы
        Thread t2 = new Thread(() -> {
            while (true) {
                // сохраним текущее время
                long start = System.currentTimeMillis();
                // приостановим поток
                sleep(1000);
                // вывод миллисекунд
                System.out.println(System.currentTimeMillis()
                - start);
            }
        });

//        t1.start();
        t2.start();
    }

    // метод-обёртка, игнорирующий возможный Exception
    // в реальных приложениях так не делается
    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ignored) {
            ignored.printStackTrace();
        }
    }
}
