package NumericalAlgorithms.PrimeFactors;

import java.util.ArrayList;

public class FindFactors {
    // алгоритм нахождения простых множителей целого неотрицательного числа

    public static ArrayList<Integer> methodFindFactors(int number) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (number%2 == 0) {
            arrayList.add(2);
            number = number / 2;
        }
        int i = 3;
        while (i < number) {
            while (number%i == 0) {
                arrayList.add(i);
                number = number / i;
            }
            i = i + 2;
        }
       if (number > 1) {
           arrayList.add(number);
       }
       return arrayList;
    }
}
