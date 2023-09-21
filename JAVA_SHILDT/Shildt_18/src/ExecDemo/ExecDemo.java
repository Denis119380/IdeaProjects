package ExecDemo;

class ExecDemo {

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process process = null;

        try {
            process = rt.exec("notepad");
            process.waitFor();
        } catch (Exception e) {
            System.out.println("Error runtime Notepad.");
        }
        System.out.println("Text editor 'Notepad' returned: " + process.exitValue());
    }
}
