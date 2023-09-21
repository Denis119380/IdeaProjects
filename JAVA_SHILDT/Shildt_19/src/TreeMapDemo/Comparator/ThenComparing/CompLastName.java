package TreeMapDemo.Comparator.ThenComparing;

import java.util.Comparator;

public class CompLastName implements Comparator<String> {
    public int compare(String o1, String o2) {
        int i, j;
        i = o1.lastIndexOf(" ");
        j = o2.lastIndexOf(" ");
        return o1.substring(i).compareToIgnoreCase(o2.substring(j));
    }
}
