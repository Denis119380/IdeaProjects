package SpeedOfSomeThread;

import java.util.ArrayList;
import java.util.List;

public class ThreePartThread implements Runnable{
    Thread t;

    ThreePartThread() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        // программа: создание коллекции чисел
        // и удаление компонентов с конца и до полной очистки
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10000000; i++) {
            list.add(i);
        }
        while (list.size() != 0) {
            list.remove(list.size() - 1);
        }
        System.out.println("List cleared");
    }
}
