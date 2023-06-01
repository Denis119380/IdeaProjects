package UsingNestTry;

public class MethNestTry { // Операторы try могут быть неявно
                           // вложены в вызов методов.
    static void nestTry(int a) {
        try { // вложенный блок оператора try
            /* Если указан один аргумент командной строки,
               то исключение в связи с делением на нуль
               будет сгенерированно в следующем коде. */
            if (a == 1) a = a / (a - a); // деление на нуль

            /* Если указаны два аргумента командной строки,
               то генерируется исключение в связи с выходом
               за пределы массива. */
            if (a == 2) {
                int[] c = { 1 };
                c[42] = 99; // здесь генерируется исключение
                     // в связи с выходом за пределы массива
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс за пределами массива: "
            + e);
        }
    }

    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            /* Если не указаны аргументы командной строки,
               в следующем операторе будет сгенерированно
               исключение в связи с делением на нуль. */
            int b = 42 / a;
            nestTry(a);
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль: " + e);
        }
    }
}
