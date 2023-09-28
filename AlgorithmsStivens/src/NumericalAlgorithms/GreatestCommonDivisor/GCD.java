package NumericalAlgorithms.GreatestCommonDivisor;

public class GCD {
    public static int methGCD(int a, int b) {
        int reminder;
            while (b != 0) {
                reminder = a % b;
                a = b;
                b = reminder;
            }
        return a;
    }
}
