package TreeMapDemo.Comparator.ThenComparing;

import java.util.Comparator;

public class CompThenByFirstName implements Comparator<String> {
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}
