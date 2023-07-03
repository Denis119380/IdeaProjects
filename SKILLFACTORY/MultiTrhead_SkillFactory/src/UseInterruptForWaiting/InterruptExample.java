package UseInterruptForWaiting;

public class InterruptExample {

    public static void main(String[] args) throws
            InterruptedException {
        Thread threadToInterrupt = new Thread() {
            public void run(){
                while (true) {
                    System.out.println("Working hard");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted!");
                        break;
                        // когда обрабатывается исключение
                        // метод run() доходит до конца
                        // и поток завершает работу
                    }
                }
            }
        };

        threadToInterrupt.start();
        Thread.currentThread().sleep(2500);
        threadToInterrupt.interrupt(); // метод прерывания потока
    }
}
