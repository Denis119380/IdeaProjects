package FizzBuzz_412;

import java.util.ArrayList;
import java.util.List;

class Solution {
    // В последовательность натуральных чисел нужно вставить Fizz,
    // если делится на 3, и Buzz, если на 5. FizzBuzz если на оба делится.
    public static List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>();
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
            if (num[i]%3 == 0 && num[i]%5 != 0) arr.add("Fizz");
            else if (num[i]%3 != 0 && num[i]%5 == 0) arr.add("Buzz");
            else if (num[i]%3 == 0 && num[i]%5 == 0) arr.add("FizzBuzz");
            else arr.add(Integer.toString(num[i]));
        }
        return arr;
    }

    public static List<String> fizzBuzz1(int n) {
        List<String> answer = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i%3 == 0;
            boolean divisibleBy5 = i%5 == 0;

            if (divisibleBy3 && divisibleBy5) {
                answer.add("FizzBuzz");
            } else if (divisibleBy3) {
                answer.add("Fizz");
            } else if (divisibleBy5) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }

    public static List<String> fizzBuzz2(int n) {
        List<String> answer = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i%3 == 0;
            boolean divisibleBy5 = i%5 == 0;

            String currStr = "";
            if (divisibleBy3) {
                currStr += "Fizz";
            }
            if (divisibleBy5) {
              currStr += "Buzz";
            }
            if (currStr.isEmpty()) {
                currStr += String.valueOf(i);
            }
            answer.add(currStr);
        }
        return answer;
    }

    public static void main(String[] args) {
        List<String> ob1 = fizzBuzz(20);
        List<String> ob2 = fizzBuzz1(15);
        List<String> ob3 = fizzBuzz2(25);
        for (String str : ob1) System.out.print(str + " ");
        System.out.println();
        for (String str : ob2) System.out.print(str + " ");
        System.out.println();
        for (String str : ob3) System.out.print(str + " ");
    }
}
