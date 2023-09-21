package SpliteratorDemo;

import java.util.ArrayList;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(1.00);
        arrayList.add(2.00);
        arrayList.add(3.00);
        arrayList.add(4.00);
        arrayList.add(5.00);

        System.out.println("The contents of arraylist: ");
        Spliterator<Double> spliterator = arrayList.spliterator();
        while (spliterator.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        spliterator = arrayList.spliterator();
        ArrayList<Double> sqr = new ArrayList<>();
        while (spliterator.tryAdvance((n) -> sqr.add(Math.sqrt(n))));

        System.out.println("The contents of sqr arraylist: ");
        spliterator = sqr.spliterator();
        sqr.forEach((n) -> System.out.println(n));
    }
}
