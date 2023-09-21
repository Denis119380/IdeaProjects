package CloneDemo.Demo2;

public class CloneDemo {
    public static void main(String[] args) {
        TestClone x1 = new TestClone();
        TestClone x2;
        x1.a = 30;
        x1.b = 40.34;
        x2 = (TestClone) x1.clone();
        System.out.println("x1: " + x1.a + ", " + x1.b);
        System.out.println("x2: " + x2.a + ", " + x2.b);
    }
}
