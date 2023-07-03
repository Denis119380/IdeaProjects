package SpeedOfSomeThread;

public class Main {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        OnePartThread one = new OnePartThread();
        TwoPartThread two = new TwoPartThread();
        ThreePartThread three = new ThreePartThread();

        try {
            one.t.join();
            two.t.join();
            three.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start) + " ms");
    }
}
