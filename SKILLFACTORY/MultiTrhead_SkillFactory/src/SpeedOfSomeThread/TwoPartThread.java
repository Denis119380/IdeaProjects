package SpeedOfSomeThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoPartThread implements Runnable{
    Thread t;

    TwoPartThread() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        // программа: создание коллекции чисел
        // и сортировка коллекции по порядку
        List<Integer> unsorted = new ArrayList<>();
        for (int i = 10000000; i >= 1; i--) {
            unsorted.add(i);
        }
        Collections.sort(unsorted);
        System.out.println("List is sorted now");
    }
}
