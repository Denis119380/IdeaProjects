package UseMethodsJoinAndIsAlive;

// Применение метода join(), чтобы ожидать завершения
// потоков
// Применение метода isAlive(), чтобы знать, исполняются ли
// потоки
class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread(String name) {
        this.name = name;
        t = new Thread(this, this.name);
        System.out.println("Новый поток: " + t);
        t.start(); // запустить поток исполнения
    }

    // Точка входа во второй поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершён.");
    }
}
