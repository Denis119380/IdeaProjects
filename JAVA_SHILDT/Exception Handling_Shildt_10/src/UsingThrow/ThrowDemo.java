package UsingThrow;

public class ThrowDemo { // Демонстрация применения
                         // оператора throw
    static void demoPro() {
        try {
            throw new NullPointerException("демонстрация");
            // первый способ получения объекта Throwable,
            // (стандартное иключение) с помощью операции new
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле" +
                    "метода demoPro().");
            throw e; // повторно сгенерировать исключение
            // второй способ получения объекта Throwable
            // (стандартное исключение) в операторе catch
        }
    }

    public static void main(String[] args) {
        try {
            demoPro();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: " + e);
        }
    }
}
