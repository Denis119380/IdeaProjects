import java.text.NumberFormat;
import java.text.ParseException;

class Test {

    public static void main(String[] args) {
        int num1 = 10, num2 = 0;

        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            // отдельный потоковый вывод выполняется с помощью команды err
            // соббщения могут меняться местами (пользовательское и ошибка),
            // потому что разные потоки
            System.err.println("На ноль делить нельзя.");
        } finally {
            System.out.println("Программа завершается.");
        }
    }
}
