package UseInterfaceComparable;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Product> set = new TreeSet<>();
        // Если в классе Product не будет имплементирован интерфейс
        // Comparable, который определяет логику сортировки,
        // произойдёт исключение java.lang.ClassCastException
        set.add(new Product("СуперБренд",
                "Колбаса", 342,
                LocalDateTime.now()));
        set.add(new Product("ЛучшийБренд", "Сыр",
                432, LocalDateTime.now()));
        for (Product product : set) {
            System.out.println(product.getBrand());
        }
    }
}
