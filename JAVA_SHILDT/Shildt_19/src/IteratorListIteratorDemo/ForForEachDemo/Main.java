package IteratorListIteratorDemo.ForForEachDemo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);

        System.out.print("The original contents of arraylist: ");
        for (int i : arrayList) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("The sum of values arraylist: ");
        int sum = 0;
        for (int i : arrayList) {
           sum += i;
        }
        System.out.print(sum);
    }
}
