package DeadLock;
// Пример взаимной блокировки
class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        // метод currentThread() даёт ссылку на объект,
        // которым является текущий поток, и затем,
        // метод getName() возвращает имя потока
        System.out.println(name + " вошёл в метод A.foo()");

        try {
            // метод sleep() вызывается специально для
            // демонстрации, чтобы вызвать блокировку
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Класс А прерван");
        }
        System.out.println(name +
                " пытается вызвать метод B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("В методе A.last()");
    }
}
