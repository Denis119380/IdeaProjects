public interface MyIF {

    int getNumber(); // объявление обычного метода в интерфейсе
                     // он не предоставляет реализацию по умолчанию

    default String getString() {
        return "Объект типа String по умолчанию.";
    } // объявление метода с реализацией по умолчанию

    static int getDefaultNumber() {
        System.out.println("Реализуется статический метод интерфейса.");
        return 0;
    } // объявление статического метода
}
