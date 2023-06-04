package CreatingYourOwnExceptionSubclasses;

class ExceptionDemo {

    static void compute(int a) throws MyException {
        // метод генерирует объект исключения типа MyException(),
        // в том случае когда параметр compute() превышает 10
        System.out.println("Вызван метод compute(" + a + ")");
        if (a > 10)
            throw new MyException(a);
        System.out.println("Нормальное завершение");
    }

    public static void main(String[] args) {
        // метод устанавливает обработчик исключений типа MyException,
        // вызывается метод compute() с правильным и
        // неправильным значением параметра
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
