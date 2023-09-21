package ThreadGroupDemo;

public class Main {
    public static void main(String[] args) {
        ThreadGroup group1 = new ThreadGroup("Group A");
        ThreadGroup group2 = new ThreadGroup("Group B");

        NewThread ob1 = new NewThread("One", group1);
        NewThread ob2 = new NewThread("Two", group1);
        NewThread ob3 = new NewThread("Three", group2);
        NewThread ob4 = new NewThread("Four", group2);

        System.out.println("\n Output from method list:");
        group1.list();
        group2.list();
        System.out.println();

        System.out.println("Suspend Group A");
        Thread[] threads = new Thread[group1.activeCount()];
        group1.enumerate(threads);
        for (int i = 0; i < threads.length; i++) {
            ((NewThread)threads[i]).mySuspend();
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Main thread suspend.");
        }
        System.out.println("Resume Group A.");
        for (int i = 0; i < threads.length; i++) {
            ((NewThread)threads[i]).myResume();
        }
        try {
            System.out.println("Waiting for performance threads to complete");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (Exception e) {
            System.out.println("Exception into main performance thread.");
        }
        System.out.println("Main thread complete.");
    }
}
