package ArrayDequeDemo;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("B");
        arrayDeque.add("A");
        arrayDeque.add("D");
        arrayDeque.add("C");
        arrayDeque.add("E");

        System.out.println(arrayDeque);
        System.out.print("Popping from the stack: ");
        while (arrayDeque.peek() != null) {
            System.out.print(arrayDeque.pop() + " ");
        }
    }
}
