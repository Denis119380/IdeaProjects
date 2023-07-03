package Pizza;

import java.util.concurrent.LinkedBlockingDeque;
// Модель работы пиццерии: поступает заказ, вагон-пиццерия
// принимает заказ (2вагона), едет к клиент и печёт пиццу,
// это происходит за 500мсек(условно)
// Но, клиент отменит заказ если доставка превысит 750мсек
class Pizzeria {

    // создаётся класс под объект заказа, в котором переменные:
    // название пиццы и время заказа
    class Order {
        String pizzaName;
        long orderTime;
        Order(String pizzaName, long orderTime){
            this.pizzaName = pizzaName;
            this.orderTime = orderTime;
        }
    }

    // коллекци в которую кладутся-берутся заказы
    LinkedBlockingDeque<Order> orders = new
            LinkedBlockingDeque<>();

    // метод при помощи которого из класса Main,
    // формируют и кладут заказ в коллекцию
    void order(String pizzaName) {
            orders.offer(new Order(pizzaName,
                    System.currentTimeMillis()));
    }

    // класс многопоточный: вагончик-пиццерия,
    // учитывается рабочее время, от начала и до текущего времени, не более 5сек

    class Wagon extends Thread {
        public void run() {
            while ((System.currentTimeMillis() - START_TIME)
            < 5000) {
                Order order;
                order = orders.poll(); // заказ берётся из коллекции
                if(order != null) {
                    // проверка, успеет ли вагончик-пиццерия выполнить заказ во время
                    if (System.currentTimeMillis() -
                    order.orderTime + 500 <= 750) {
                        try {
                            Thread.sleep(500);
                            System.out.println(order.pizzaName
                                    + " is delivered");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    else {
                        System.out.println(order.pizzaName
                        + " is NOT delivered");
                    }
                }
            }
        }
    }

    final long START_TIME; // переменная-константа начала работы всей программы

    // конструктор создания пиццерии с двумя вагончиками
    public Pizzeria() {
        START_TIME = System.currentTimeMillis();
        new Wagon().start();
        new Wagon().start();
    }
}
