import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        int a = 5, b = 2;
        double c = 4.50;
        double res = pow(a, b); // метод возведения числа в степень
        System.out.println(res);
        System.out.println("PI= " + PI); // число пи, отношение длины окружности к её диаметру
        System.out.println("E= " + E); // число е, основание натурального логарифма
        System.out.println();
        System.out.println(abs(a)); // метод возвращает абсолютное значение числа
        System.out.println(sqrt(b)); // метод возвращает квадратный корень из числа
        System.out.println();

        System.out.println(max(a, b)); // метод возвращает большее из двух чисел
        System.out.println(min(a, b)); // метод возвращает меньшее из двух чисел
        System.out.println();

        System.out.println(random()); // метод возвращает число от 0 до 1
        System.out.println();
        System.out.println(rint(c)); // метод округляет в меньшую сторону от 0.5
        System.out.println(round(c)); // метод округляет в большую сторону от 0.5
    }
}