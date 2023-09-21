package LambdaDemo1;

class LambdaDemo1 {
    public static void main(String[] args) {
        IsNumb isEven = n -> (n % 2) == 0;
        if (isEven.isNum(10)) System.out.println("Number 10 is even.");
        if (!isEven.isNum(9)) System.out.println("Number 9 is not even.");

        IsNumb isNonNeg = n -> n >= 0;
        if (isNonNeg.isNum(2)) System.out.println("Number 2 is non negative.");
        if (!isNonNeg.isNum(-2)) System.out.println("Number -2 is negative.");
    }
}
