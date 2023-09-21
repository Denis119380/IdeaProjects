package ThreadGroupDemo;

public class NewThread extends Thread{
    boolean suspendFlag;
    NewThread(String threadName, ThreadGroup groupName) {
        super(groupName, threadName);
        System.out.println("New thread: " + this);
        suspendFlag = false;
        start();
    }
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception into " + getName());
        }
        System.out.println(getName() + " complete.");
    }
    synchronized void mySuspend() {
        suspendFlag = true;
    }
    synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}
