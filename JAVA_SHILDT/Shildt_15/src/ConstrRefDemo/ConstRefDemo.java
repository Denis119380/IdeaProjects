package ConstrRefDemo;

public class ConstRefDemo {
    public static void main(String[] args) {
        MyFunc<Integer> myClassCons = MyClass<Integer> :: new;
        MyClass<Integer> mc = myClassCons.func(100);
        System.out.println("Value val to object mc equals: " + mc.getVal());
    }
}
