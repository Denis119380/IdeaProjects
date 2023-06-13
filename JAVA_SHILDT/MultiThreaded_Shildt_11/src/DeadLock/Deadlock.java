package DeadLock;
// Пример взаимной блокировки
class Deadlock implements Runnable{
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Главный поток");
        // метод currentThread() даёт ссылку на объект,
        // которым является текущий поток, и затем,
        // метод setName() даёт имя потока
        Thread t = new Thread(this,"Соперничающий поток");
        // создаём новый поток
        t.start();

        a.foo(b); // получить блокировку для объекта a
                  // в данном потоке исполнения
        System.out.println("Назад в главный поток");
    }

    public void run() {
        b.bar(a); // получить блокировку для объекта b
                  // в другом потоке исполнения
        System.out.println("Назад в другой поток");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
