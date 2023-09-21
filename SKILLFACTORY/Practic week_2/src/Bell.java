public class Bell {
    public static void main(String args[]) {
        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();
    }
    int i;
    void sound() {
        if (i == 0) {
            System.out.println("ding");
            i++;
        } else {
            System.out.println("dong");
            i--;
        }
    }
}