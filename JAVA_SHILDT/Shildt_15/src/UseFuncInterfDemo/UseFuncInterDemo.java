package UseFuncInterfDemo;

import java.util.function.Function;

class UseFuncInterDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) result *= i;
            return result;
        };
        System.out.println("Factorial number 5 is: " + factorial.apply(5)); // Предопределённый функциональный интерфейс
        System.out.println("Factorial number 3 is: " + factorial.apply(3)); // Function<T,R> имеет метод apply()
    }
}
