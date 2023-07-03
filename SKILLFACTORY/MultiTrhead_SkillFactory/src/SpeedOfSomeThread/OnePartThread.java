package SpeedOfSomeThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OnePartThread implements Runnable{
    Thread t;
    OnePartThread() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        // программа: создание коллекции чисел
        // и поиск максимального значения
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10000000; i++) {
            numbers.add(i);
        }
        int max = Collections.max(numbers);
        System.out.println("Max found: " + max);
    }
}
