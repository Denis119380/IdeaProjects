package CurrentTime;

class Elapsed {
    public static void main(String[] args) {
        long start, end;
        System.out.println("Time measurement one hundred million iterations");
        start = System.nanoTime();
        for (int i = 0; i < 100000000L; i++);
        end = System.nanoTime(); // can use currentTimeMills()
        System.out.println("Elapsed time in nanosecond: " + (end - start));
    }
}
