package AlgorithmsDemo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(20);
        linkedList.add(-8);
        linkedList.add(8);
        linkedList.add(-20);

        System.out.print("Placement order: ");
        for (int i : linkedList) {
            System.out.print(i + " ");
        }
        System.out.println();

        Collections.sort(linkedList);
        System.out.print("Natural order: ");
        for (int i : linkedList) {
            System.out.print(i + " ");
        }
        System.out.println();

        Comparator<Integer> comparator = Collections.reverseOrder();
        linkedList.sort(comparator);
        System.out.print("Reverse order: ");
        for (int i : linkedList) {
            System.out.print(i + " ");
        }
        System.out.println();

        Collections.shuffle(linkedList);
        System.out.print("Random order: ");
        for (int i : linkedList) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Max value: " + Collections.max(linkedList));
        System.out.println("Min value: " + Collections.min(linkedList));
    }
}
