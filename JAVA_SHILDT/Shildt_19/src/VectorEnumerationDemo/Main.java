package VectorEnumerationDemo;

import java.util.Enumeration;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(3,2);
        System.out.println("Capacity vector object: " + vector.capacity());
        System.out.println();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);

        System.out.println("Capacity vector object after input elements: " + vector.capacity());
        System.out.println("Size vector object after input elements: " + vector.size());
        vector.addElement(5);
        System.out.println("Capacity after input next element: " + vector.capacity());

        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());
        if (vector.contains(3)) {
            System.out.println("Vector object contains value 3.");
        }

        Enumeration<Integer> enumeration = vector.elements();
        System.out.println("\nElements of vector object: ");
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
    }
}
