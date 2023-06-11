package CorrectImplementationOfThreadInteraction;
// Правильная реализация поставщика и потребителя
class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        // Рекомендация компании Oracle вызывать метод wait()
        // в цикле, проверяющем условие. Для предотвращения
        // ложной активизации, т.е. возобновление потока без
        // очевидных причин.
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Исключение типа "
                + "InterruptedException перехвачено");
            }
        System.out.println("Получено: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Исключение типа "
                + "InterruptedException перехвачено");
            }

        this.n = n;
        valueSet = true;
        System.out.println("Отправлено: " + n);
        notify();
    }
}
