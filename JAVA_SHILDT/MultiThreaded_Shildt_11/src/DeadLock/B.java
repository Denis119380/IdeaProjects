package DeadLock;
// Пример взаимной блокировки
class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        // метод currentThread() даёт ссылку на объект,
        // которым является текущий поток, и затем,
        // метод getName() возвращает имя потока
        System.out.println(name + " вошёл в метод B.bar()");

        try {
            // метод sleep() вызывается специально для
            // демонстрации, чтобы вызвать блокировку
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Класс В прерван");
        }

        System.out.println(name +
                " пытатется вызвать метод A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("В методе B.last()");
    }
}
