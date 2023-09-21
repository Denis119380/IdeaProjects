package BoundedType;

class Stats<T extends Number> {
    T[] num;
    Stats(T[] num) {
        this.num = num;
    }
    double average() {
        double sum = 0.0;
        for (int i = 0; i < num.length; i++)
            sum += num[i].doubleValue(); // Если не сделать ограничение типа до класса Number,
                                         // (т.е. T должен быть классом Number или наследуемым от него классом)
                                         // то в этой строчке кода будет ошибка компиляции.
                                         // Потому что, метод doubleValue() распространяется на
                                         // числовые значения массива.
        return sum / num.length;
    }

    void sameAverage(Stats<?> ob) { // использование метасимвольного аргумента
        if (average() == ob.average()) System.out.println("Average values of arrays equal.");
        else System.out.println("Average values of arrays no equal.");
    }
}
