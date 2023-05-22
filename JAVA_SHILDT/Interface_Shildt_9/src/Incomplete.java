abstract class Incomplete implements Callback{
    // abstract class может не реализовывать методы интерфейса,
    // но наследующий класс должен реализовать методы интерфейса
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
}
