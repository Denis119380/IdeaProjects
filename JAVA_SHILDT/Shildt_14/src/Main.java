public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        test(22, 22); // происходит ссылка на один и тот же обеъект,
                      // использование Integer pool;

        test(222, 222); // не происходит ссылка на один объект(разные объекты) т.к.,
                        // значение 222 выходит за интервал [-128, 127]
    }

    public static void test(Integer i1, Integer i2) {
        System.out.println(i1 == i2);
    }
}