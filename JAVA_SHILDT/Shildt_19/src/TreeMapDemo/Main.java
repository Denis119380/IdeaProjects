package TreeMapDemo;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Double> treeMap = new TreeMap<>();
        treeMap.put("Jon Dou", 3434.23);
        treeMap.put("Tom Smith", 123.22);
        treeMap.put("Jayne Beaker", 1378.00);
        treeMap.put("Tod Hall", 99.22);

        Set<Map.Entry<String, Double>> set = treeMap.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        double balance = treeMap.get("Jon Dou");
        treeMap.put("Jon Dou", balance + 1000);
        System.out.println("New count of Jon Dou: " + treeMap.get("Jon Dou"));
    }
}
