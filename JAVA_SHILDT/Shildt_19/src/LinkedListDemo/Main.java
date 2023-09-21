package LinkedListDemo;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("S");
        linkedList.add("G");
        linkedList.add("H");
        linkedList.add("K");
        linkedList.add("L");
        linkedList.addLast("Z");
        linkedList.addFirst("A");
        linkedList.add(1, "A1");

        System.out.println("View LinkedList: " + linkedList);
        linkedList.remove("G");
        linkedList.remove(2);
        System.out.println("View LinkedList: " + linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("View LinkedList: " + linkedList);

        String str = linkedList.get(2);
        linkedList.set(2, str + " change");
        System.out.println("View LinkedList: " + linkedList);
    }
}
