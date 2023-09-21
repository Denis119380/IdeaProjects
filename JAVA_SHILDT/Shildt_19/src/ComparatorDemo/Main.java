package ComparatorDemo;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println(new MyComp().equals(new MyComp()));
        TreeSet<String> treeSet = new TreeSet<>(new MyComp().reversed());
        treeSet.add("C");
        treeSet.add("B");
        treeSet.add("A");

        for (String str : treeSet) {
            System.out.print(str + " ");
        }
    }


}
