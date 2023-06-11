package CorrectImplementationOfThreadInteraction;


class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Поставщик").start();
    }

    public void run() {
        // реализация опроса в виде цикла
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}
