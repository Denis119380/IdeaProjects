package StreamUse;

import java.util.*;

// В списке отобрать первые две строки в алфавитном
// порядке, которые имеют длину 4
public class WithOutStream {
    public static void main(String[] args) {
        // создание коллекции, которая будет обрабатываться
        List<String> list = Arrays.asList("Toby",
                "Anna", "Leroy", "Alex");
        // создание коллекции, в которой длина элементов будет 4
        List<String> filtered = new ArrayList<>();
        for (String name : list) {
            if(name.length() == 4) filtered.add(name);
        }

        // сортировка полученной коллекции по алфавиту
        Collections.sort(filtered);
        // далее, используя иттератор,
        // выводим в консоль первые две строки
        Iterator<String> iter = filtered.iterator();
        if (iter.hasNext()) {
            System.out.println(iter.next());
        }
        if (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
