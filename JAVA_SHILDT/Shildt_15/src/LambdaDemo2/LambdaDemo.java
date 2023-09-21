package LambdaDemo2;

class LambdaDemo {
    public static void main(String[] args) {
        IsNum num = (a, b) -> (a % b) == 0;
        if (num.test(12, 6)) System.out.println("Number 6 is multiplier of 12.");
        if (!num.test(12, 7)) System.out.println("Number 7 is not multiplier of 12.");
    }
}
