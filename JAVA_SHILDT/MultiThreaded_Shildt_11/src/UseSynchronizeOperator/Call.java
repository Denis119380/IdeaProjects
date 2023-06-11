package UseSynchronizeOperator;

// В этой программе используется синхронизированный блок
// метод call() объявлен без модификатора доступа synchronized
// Вместо этого используется оператор synchronized в теле метода run() класса Caller
class Call {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
            // метод sleep() используется для наглядности
            // применения синхронизации метода call()
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
        System.out.println("]");
    }
}
