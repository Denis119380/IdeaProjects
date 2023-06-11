package CorrectImplementationOfThreadInteraction;

class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Потребитель").start();
    }

    public void run() {
        // реализация опроса в виде цикла
        while (true) {
            q.get();
        }
    }
}
