package BankClient;

import java.util.concurrent.atomic.AtomicInteger;

public class BankAtomic {
    // создаём объект класса AtomicInteger
    // операции с этим объектом целостные
    // и другие потоки не могут вливаться
    AtomicInteger money = new AtomicInteger();

    int getMoney() {
        // для вызова значения используем
        // метод класса AtomicInteger
        return money.get();
    }

    void take(int money) {
        // безопасно уменьшаем
        this.money.addAndGet(-money);
    }

    void repay(int money) {
        // безопасно увеличиваем
        this.money.addAndGet(money);
    }

    class Client extends Thread {
        @Override
        public void run() {
            while (true) {
                // выдаём кредит если есть средства
                if (getMoney() >= 1000) {
                    take(1000);
                    repay(1000);
                }
            }
        }
    }

    public BankAtomic() {
        // устанавливаем начальное значение
        // используя метод класса AtomicInteger
        money.set(10000);
        for (int i = 0; i < 5; i++)
            new Client().start();
    }

    public static void main(String[] args) throws
            InterruptedException {
        BankAtomic bank = new BankAtomic();
        while (true) {
            System.out.println(bank.getMoney());
            Thread.sleep(1000);
        }
    }
}
