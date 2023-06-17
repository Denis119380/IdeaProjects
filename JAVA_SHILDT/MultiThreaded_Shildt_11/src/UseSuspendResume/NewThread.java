package UseSuspendResume;
// Приостановка и возобновление исполнения
// потока современным способом
class NewThread implements Runnable {

    String name;
    Thread t;
    boolean suspendFlag; // флаговая переменная используемая
                         // для управления выполнением потока

    NewThread(String name) {
        this.name = name;
        t = new Thread(this, this.name);
        System.out.println("Новый поток: " + t);
        suspendFlag = false;
        t.start(); // запустить поток исполнения
    }

    // Точка входа в поток исполнения
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
    }

    synchronized void mySuspend() {
        suspendFlag = true;
    }

    synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}
