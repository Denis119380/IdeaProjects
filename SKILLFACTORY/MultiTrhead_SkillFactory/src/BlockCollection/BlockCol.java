package BlockCollection;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class BlockCol {
    public static void main(String[] args) {
        try {
            BlockingDeque<Integer> blockingDeque = new
                    LinkedBlockingDeque<>();
            blockingDeque.offer(91);
            blockingDeque.offerFirst(5, 2,
                    TimeUnit.MINUTES);
            // добавление в начало с ожиданием доступного
            // места (если очередь фиксированной длины)

            blockingDeque.offerLast(47, 100,
                    TimeUnit.MICROSECONDS);
                    // добавление в конец
            blockingDeque.offer(3, 4,
                    TimeUnit.SECONDS);
            // добавление в конец

            System.out.println(blockingDeque.poll());
            System.out.println(blockingDeque.poll(950,
                    TimeUnit.MILLISECONDS));
            // удаление с начала, будет ожидание
            System.out.println(blockingDeque.pollFirst(200,
                    TimeUnit.NANOSECONDS));
            System.out.println(blockingDeque.pollLast(1,
                    TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
