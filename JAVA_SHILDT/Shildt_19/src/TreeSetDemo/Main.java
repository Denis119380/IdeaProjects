package TreeSetDemo;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("D");
        treeSet.add("E");
        treeSet.add("B");
        System.out.println("View TreeSet: " + treeSet);

        System.out.println("View method of NavigableSet: " + treeSet.subSet("B", "E"));
    }
}
