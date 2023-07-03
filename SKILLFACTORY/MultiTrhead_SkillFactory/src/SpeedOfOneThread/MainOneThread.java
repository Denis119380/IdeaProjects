package SpeedOfOneThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOneThread {

    public static void main(String[] args) {
        // фиксируем время в начале программы
        long start = System.currentTimeMillis();

        // 1 часть программы: создание коллекции чисел
        // и поиск максимального значения
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10000000; i++) {
            numbers.add(i);
        }
        int max = Collections.max(numbers);
        System.out.println("Max found: " + max);

        // 2 часть программы: создание коллекции чисел
        // и сортировка коллекции по порядку
        List<Integer> unsorted = new ArrayList<>();
        for (int i = 10000000; i >= 1; i--) {
            unsorted.add(i);
        }
        Collections.sort(unsorted);
        System.out.println("List is sorted now");

        // 3 часть программы: создание коллекции чисел
        // и удаление компонентов с конца до полной очистки
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10000000; i++) {
            list.add(i);
        }
        while (list.size() != 0) {
            list.remove(list.size() - 1);
        }
        System.out.println("List cleared");

        // фиксируем время в конце программы
        long end = System.currentTimeMillis();

        System.out.println("Total time: " + (end - start) + " ms");
    }
}
