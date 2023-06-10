package UseSynchronizeMeth;

// Эта программа может быть как синхронизирована
// так и нет; перед методом call() есть или нет
// ключевое слово synchronized
class Call {
    synchronized void call(String msg) {
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
