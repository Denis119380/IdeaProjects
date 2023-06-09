package NewThreadExtendsClassThread;

class NewThread extends Thread {
    // создать второй поток способом
    // расширения класса Thread

    NewThread() {
        // создать новый поток исполнения
        super("Демонстрационный поток");
        // метод super() вызывает конструктор класса Thread
        // его общая форма: public Thread(String имя_потока)
        System.out.println("Дочерний поток: " + this);
        start(); // запустить поток на исполнение
    }

    // Точка входа во второй поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний поток завершён.");
    }
}
