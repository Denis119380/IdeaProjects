package LamdaFunction1;

import java.util.function.Function;

public class Main {
    // Продемонстрированные две реализации метода
    // существовали до Java8, и были большой проблемой,
    // проблемой компактности кода
    public static void main(String[] args) {
        int value = 70;
        int newValue = 80;

        // реализация с помощью дополнительного класса
//        validate(value, new ValidatorImpl());

//         реализация с помощью аннонимного класса
//        validateText(value, new Validator() {
//            @Override
//            public boolean validate(int value) {
//                return value >= 80;
//            }
//        });

        // реализация с помощью лямда-функции
        validateText(value, (int value1) -> value >= 60);
        validateText(newValue, (int value1) -> newValue >= 100);




//        doubleFromString(value, value1 -> Double.valueOf(value));

//        doubleValue(new DoubleValue())
    }



    private static void validateText(
            int value, Validator validator) {

        System.out.println("Проверяем значение:");
        boolean isValid = validator.validate(value);
        if (isValid)
            System.out.println("Верно!");
        else System.out.println("Неверно.");
    }




    public static double doubleFromString(
            int value, Worker worker) {
        return worker.rework(value);
    }

//    public static doubleValue() {
//
//    }

}
