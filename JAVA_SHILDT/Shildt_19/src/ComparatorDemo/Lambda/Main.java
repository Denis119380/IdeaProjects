package ComparatorDemo.Lambda;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // создание компаратора с помощью лямда выражения
        Comparator<String> comparator = (String o1, String o2) -> o2.compareTo(o1);

        // создание коллекции множества
        TreeSet<String> treeSet = new TreeSet<>(comparator);
        treeSet.add("add");
        treeSet.add("zoo");
        treeSet.add("boo");

        for (String str : treeSet) {
            System.out.print(str + " ");
        }
    }
}
