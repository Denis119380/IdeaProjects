package modul3;

import java.util.Arrays;

public class Main {
    public double weight;
    public String name;

    public Main(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public static void viewArr(float[] arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
            if (i == arr.length - 1) {
                System.out.println("Сумма чисел массива " + sum);
            }
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println("Наибольший элемент: " + arr[i]);
            }
        }

    }

}
