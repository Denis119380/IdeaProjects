public class InnerClassDemo {
    public static void main(String[] args) {

        Outer outer = new Outer(); // создаётся экземпляр класса Outer
        outer.test1(); // вызывается метод класса Outer, в котором создаётся экземпляр класса Inner1
                       // и вызывается метод display()
        System.out.println();
        outer.test2();

    }
}