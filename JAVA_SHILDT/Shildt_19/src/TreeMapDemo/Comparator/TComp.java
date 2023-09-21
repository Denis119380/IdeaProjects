package TreeMapDemo.Comparator;

import java.util.Comparator;

public class TComp implements Comparator<String> {
    // компаратор сортирует по фамилиям, но если фамилии одинаковые, то по именам
    public int compare(String o1, String o2) {
        int i, j, k;
        i = o1.lastIndexOf(" ");
        j = o2.lastIndexOf(" ");
        k = o1.substring(i).compareTo(o2.substring(j));
        if (k == 0) {
            return o1.compareTo(o2);
        } else return k;
    }
    // переопределять метод equals() не требуется
}
