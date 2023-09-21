package TreeMapDemo.Comparator.ThenComparing;

import TreeMapDemo.Comparator.TComp;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        CompLastName compLastName = new CompLastName();
        Comparator<String> compLastThenFirst = compLastName.thenComparing(new CompThenByFirstName());

        TreeMap<String, Double> treeMap = new TreeMap<>(compLastThenFirst);
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
