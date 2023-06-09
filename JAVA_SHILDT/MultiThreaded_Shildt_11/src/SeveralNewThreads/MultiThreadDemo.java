package SeveralNewThreads;

class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("Один"); // запустить потоки на исполнение
        new NewThread("Два");
        new NewThread("Три");

        try {
            // ожидать завершение других потоков исполнения 10секунд
            // это гарантирует завершение последним главного потока
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершён.");
    }
}
