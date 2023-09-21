package ProcessBuilder;

class PBDemo {
    public static void main(String[] args) {
        try {
        ProcessBuilder processBuilder = new ProcessBuilder(
                "notepad.exe", "test"
        );
        processBuilder.start();
        } catch (Exception e) {
            System.out.println("Error started notepad.");
        }
    }
}
