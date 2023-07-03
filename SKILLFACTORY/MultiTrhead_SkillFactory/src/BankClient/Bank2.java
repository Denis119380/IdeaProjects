package BankClient;

public class Bank2 {
    private int money = 10000;

    // переменная по которой будет синхронизация
    private Object lock = new Object();

    int getMoney() {
        return money;
    }

    void take(int money) {
        synchronized (lock) {
            if (getMoney() >= 2000)
            this.money -= money;
        }
    }

    void repay(int money) {
        synchronized (lock) {
            this.money += money;
        }
    }

    class Client extends Thread{
        @Override
        public void run() {
            while (true) {
                take(2000);
                repay(2000);
            }
        }
    }
    public Bank2() {
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
    }

    public static void main(String[] args) throws
            InterruptedException{
        Bank2 bank2 = new Bank2();
        while (true) {
            System.out.println(bank2.money);
            Thread.sleep(1000);
        }
    }
}
