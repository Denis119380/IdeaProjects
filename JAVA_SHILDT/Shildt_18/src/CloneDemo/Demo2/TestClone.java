package CloneDemo.Demo2;

public class TestClone {
    int a;
    double b;
    // метод clone() переопределяется как public
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning impossible.");
            return this;
        }
    }
}
