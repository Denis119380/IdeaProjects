package CryptocurrencyExchange;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // заводим счёт на бирже
        StockAccount stockAccount = new StockAccount();
        // счёт начинает работать
        stockAccount.start();
        // прибыль
        long profit = 0;
        // блок управления
        Scanner in = new Scanner(System.in);
        String command = "";
        while (!command.equals("exit")) {
            command = in.next();
            switch (command){
                case "check":
                    // проверяем прибыль-убыль
                    System.out.println(stockAccount.money);
                    break;
                case "fix":
                    // фиксируем прибыль
                    profit += (long)stockAccount.money - 1000;
                    System.out.println("Profit is " + profit);
                    // на счету остаётся минимальный остаток
                    stockAccount.money = 1000;
            }
        }
    }
}
