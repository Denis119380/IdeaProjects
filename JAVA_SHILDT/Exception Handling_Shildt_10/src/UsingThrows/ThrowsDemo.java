package UsingThrows;

// Эта программа содержит ошибку,
// и поэтому она не подлежит компиляции
//
// class ThrowsDemo {
//   static void throwOne() {
//     System.out.println("В теле метода throwOne().");
//     throw new IllegalAccessException("демонстрация");
//   }
//   public static void main(String[] args) {
//     throwOne();
//   }
// }
// Чтобы скомпилировать программу нужно:
// Во-первых, объявить в методе throwOne() генерирование
// исключения типа IllegalAccessException
// Во-вторых, определить в методе main()
// блок оператора try/catch для перехвата исключения.
public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwOne().");
        throw new IllegalAccessException("демонстрация");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение: "
            + e);
        }
    }
}
