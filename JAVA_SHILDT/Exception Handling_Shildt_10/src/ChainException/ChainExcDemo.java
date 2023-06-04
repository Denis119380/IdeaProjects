package ChainException;

class ChainExcDemo { // демонстрация цепочки исключений

    static void demoChain() {
        // создать исключение
        NullPointerException e =
                new NullPointerException("верхний уровень");

        // добавить причину исключения
        e.initCause(new ArithmeticException("причина"));

        throw e; // генерирование исключения
    }

    public static void main(String[] args) {
        try {
            demoChain();
        } catch (NullPointerException e) {
            // вывести исключение верхнего уровня
            System.out.println("Перехвачено исключение:"
            + e);

            // вывести исключение, послужившее причиной
            // для исключения верхнего уровня
            // используя метод getCause()
            System.out.println("Первопричина: "
            + e.getCause());
        }
    }
}
