package ArrayListDemo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("Size of ArrayList: " + arrayList.size());

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add(1, "B1");
        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("View of ArrayList: " + arrayList);

        arrayList.remove("C");
        arrayList.remove(4);
        System.out.println("View of ArrayList: " + arrayList);

        String[] strings = new String[arrayList.size()];
        strings = arrayList.toArray(strings);

        System.out.print("( ");
        for (String s:
             strings) {
            System.out.print(s + " ");
        }
        System.out.println(" )");
    }
}
