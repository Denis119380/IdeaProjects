package UsingMultipleCatch;

public class SuperSubCatch {
    /* Эта программа содержит ошибку.
    В последовательности операторов catch подкласс
    исключений должен быть указан перед его суперклассом,
    иначе это приведёт к недостижимому коду и ошибке во
    время компиляции.
     */
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println(
                    "Перехват исключений общего класса Exception.");
        }
        /* Этот оператор catch вообще не будет достигнут,
        так как подкласс ArithmeticException является
        производным от класса Exception. */
        catch (ArithmeticException e) {
            // ОШИБКА: недостижимый код!
            System.out.println("Этот код недостижим.");
        }
        // чтобы исправить, придётся изменить порядок
        // следования операторов catch
    }
}
