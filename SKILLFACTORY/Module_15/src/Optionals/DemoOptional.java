package Optionals;

import java.util.Optional;

class DemoOptional {

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score : scores) sum += score;
        return Optional.of( (double) sum / scores.length);
    }

    public static void main(String[] args) {
        Optional<Double> average1 = average(90, 100);
        Optional<Double> average2 = average();

        if (average1.isPresent()) {
            System.out.println(average1.get());
        }

        // Метод ifPresent(Consumer c) и
        // особый тип лямд - method reference
        average1.ifPresent(System.out::println);
        // компактный вариант, без присваивания переменной
        average(90, 100).ifPresent(System.out::println);

        System.out.println(average2.orElse(Double.NaN));
        System.out.println(average2.orElseGet(Math::random));

        System.out.println(average2.orElseThrow(
                IllegalStateException::new));
    }
}
