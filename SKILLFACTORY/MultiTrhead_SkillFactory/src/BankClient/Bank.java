package BankClient;

public class Bank {
    private int money = 10000;

    int getMoney() {
        return money;
    }

    // удалив ключевое слово synchronized в методах
    // take() и repay() получим не предсказуемый результат
    synchronized void take(int money) {
        this.money -= money;
    }

    synchronized void repay(int money) {
        this.money += money;
    }

    class Client extends Thread{
        @Override
        public void run() {
            while (true) {
                take(1000);
                repay(1000);
            }
        }
    }

    public Bank() {
        new Client().start();
        new Client().start();
    }

    public static void main(String[] args) throws
            InterruptedException{
        Bank bank = new Bank();
        while (true) {
            System.out.println(bank.getMoney());
            Thread.sleep(1000);
        }
    }
}
