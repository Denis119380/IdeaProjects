package NumberToStepstoZero_1342;

class Solution {
    public static int numberOfSteps(int num) {
        int result;
        int number = num;
        int step = 0;
        if (number == 0) return step;
        do {
            if (number%2 == 0) result = number / 2;
            else result = number - 1;
            number = result;
            step = ++step;
        } while (number != 0);
     return step;
    }

    // заданное число либо делим на 2, либо вычитаем 1, и это до тех пор,
    // пока конечный результат не станет 0.
    public static int numberOfSteps1(int num) {
        int step = 0;

        while (num > 0) {
            if (num%2 == 0) num /= 2;
            else num--;
            step++;
        }
        return step;
        // Time Complexity = O(logn)
        // Space Complexity = O(1)
    }

    public static int numberOfSteps2(int num) {
        // Bitwise approach, побитовый подход
        int step = 0;

        while (num > 0) {
            // Before we used %2
            if ((num & 1) == 0) num >>= 1;
            else num--;
            step++;
        }
        return step;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(0));
        System.out.println(numberOfSteps1(36));
        System.out.println(numberOfSteps2(36));
    }
}
