package Pizza;
// Модель работы пиццерии: поступает заказ, вагон-пиццерия
// принимает заказ (2вагона), едет к клиент и печёт пиццу,
// это происходит за 500мсек(условно)
// Но, клиент отменит заказ если доставка превысит 750мсек
public class Main {
    public static void main(String[] args) throws
            InterruptedException{

        Pizzeria pizzeria = new Pizzeria();
        pizzeria.order("Margarita");
        Thread.sleep(100);
        pizzeria.order("Pepperoni");
        Thread.sleep(100);
        pizzeria.order("Sicilian");
        Thread.sleep(100);
        pizzeria.order("Greek");

    }
}
