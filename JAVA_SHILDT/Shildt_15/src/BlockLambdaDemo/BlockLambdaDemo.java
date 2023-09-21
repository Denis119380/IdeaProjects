package BlockLambdaDemo;

class BlockLambdaDemo {
    public static void main(String[] args) {
        InterFunc factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) result *= i;
            return result;
        };
        System.out.println("Factorial of 5 equal: " + factorial.func(5));
        System.out.println("Factorial of 3 equal: " + factorial.func(3));
        System.out.println("Factorial of 10 equal: " + factorial.func(10));
    }
}
