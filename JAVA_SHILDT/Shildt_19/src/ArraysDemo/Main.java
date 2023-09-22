package ArraysDemo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }

        System.out.print("Source array: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Sorted array: ");
        display(array);

        Arrays.fill(array, 2, 6, -1);
        System.out.print("Filled array: ");
        display(array);

        Arrays.sort(array);
        System.out.print("Sorted array: ");
        display(array);
        int index = Arrays.binarySearch(array, -9);
        System.out.println("Index of array with value -9: " + index);
    }

    static void display(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
