package UsingMultipleCatch;

public class MultipleCatches { // продемонстрировать применение
                               // нескольких операторов catch
    public static void main(String[] args) {
        try {
            int a = args.length; // будет исключение, если без аргумента командной строки
            System.out.println("a = " + a);
            int b = 42 / a;
            int[] c = { 1 };
            c[42] = 99; // исключение, т.к. длина массива с равна 1
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации за пределами массива: " + e);
        }
        System.out.println("После блока операторов try/catch.");
    }
}
