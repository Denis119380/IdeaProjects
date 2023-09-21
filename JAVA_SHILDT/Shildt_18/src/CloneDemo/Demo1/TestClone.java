package CloneDemo.Demo1;

public class TestClone {
    int a;
    double b;
    // В этом методе вызывается метод clone() класса Object
    TestClone cloneTest() {
        try {
            return (TestClone) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning impossible.");
            return this;
        }
    }
}
