package HashMapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("Jon Dou", 3434.23);
        hashMap.put("Tom Smith", 123.22);
        hashMap.put("Jayne Beaker", 1378.00);
        hashMap.put("Tod Hall", 99.22);

        // получить множество записей
        Set<Map.Entry<String, Double>> set = hashMap.entrySet();

        // вывести множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // внести сумму 1000 на счёт Jon Dou
        double balance = hashMap.get("Jon Dou");
        hashMap.put("Jon Dou", balance + 1000);
        System.out.println("New balance to count of Jon Dou:" + hashMap.get("Jon Dou"));
    }
}
