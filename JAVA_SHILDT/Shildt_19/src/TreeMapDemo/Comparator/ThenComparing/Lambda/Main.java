package TreeMapDemo.Comparator.ThenComparing.Lambda;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Comparator<String> comparator1 = (String o1, String o2) ->
                o1.substring(o1.lastIndexOf(" ")).compareToIgnoreCase(o2.substring(o2.lastIndexOf(" ")));
        Comparator<String> comparator2 = (String o1, String o2) -> o1.compareToIgnoreCase(o2);
        Comparator<String> comparator = comparator1.thenComparing(comparator2);

        TreeMap<String, Double> treeMap = new TreeMap<>(comparator);
        treeMap.put("Jon Dou", 3434.23);
        treeMap.put("Tom Smith", 123.22);
        treeMap.put("Jayne Beaker", 1378.00);
        treeMap.put("Tod Hall", 99.22);
        treeMap.put("Adam Smith", -19.34);

        Set<Map.Entry<String, Double>> set = treeMap.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

    }
}
