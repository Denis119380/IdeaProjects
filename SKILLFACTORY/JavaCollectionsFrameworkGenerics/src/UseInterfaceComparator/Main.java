package UseInterfaceComparator;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Set<Product> products = new TreeSet<>(new NameComparator());
        Set<Product> products = new TreeSet<>(new SerialNumberComparator().reversed());
        products.add(new Product("СуперБренд", "Колбаса",
                1L, LocalDateTime.now()));
        products.add(new Product("ЛучшийБренд", "Сыр",
                2L, LocalDateTime.now()));

//        for (Product product : products) {
//            System.out.println(product.getName());
//        }
        for (Product product : products) {
            System.out.println(product.getSerialNumber());
        }
    }
}
