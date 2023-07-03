package UseInterruptedForRunnable;

public class InterruptExample {
    public static void main(String[] args) throws
            InterruptedException {
        Thread threadToInterrupt = new Thread() {
            public void run() {
                while (!isInterrupted()) {
                    System.out.println("Working hard");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
                System.out.println("All done");
            }
        };

        threadToInterrupt.start();
        Thread.currentThread().sleep(1000);
        threadToInterrupt.interrupt();
        threadToInterrupt.join();
        System.out.println("Thread finished");
    }
}
