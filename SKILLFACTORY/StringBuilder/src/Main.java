public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            stringBuilder.insert(0, "ABC");
        }
        System.out.println((System.currentTimeMillis() - startTime));
    }
}