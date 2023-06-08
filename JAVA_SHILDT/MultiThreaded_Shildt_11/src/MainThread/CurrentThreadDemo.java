package MainThread;

class CurrentThreadDemo {
    // управление главным потоком исполнения

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        // получение ссылки на текущий поток
        // вызовом метода currentThread()

        System.out.println("Текущий поток исполнения: " + t);
        // вывод сведений о потоке

        t.setName("My Thread");
        // изменить имя потока исполнения
        System.out.println("После изменения имени потока: "
        + t);
        // вывод сведений об изменившимся потоке

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
                // задержка вывода цифр в 1000 мсек
                // с помощью метода sleep()
            }
        } catch (InterruptedException e) {
            // метод sleep() может сгенерировать исключение
            // типа InterruptException
            System.out.println(
                    "Главный поток исполнения прерван"
            );
        }
    }
}
