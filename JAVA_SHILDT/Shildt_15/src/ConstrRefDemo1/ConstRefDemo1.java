package ConstrRefDemo1;

class ConstRefDemo1 {
    static <R,T> R consFactory(MyFunc<R,T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc<MyClass1<Integer>, Integer> myClassCons1 = MyClass1 :: new;
        MyClass1<Integer> ob1 = consFactory(myClassCons1, 101);

        MyFunc<MyClass1<Double>, Double> myClassCons2 = MyClass1 :: new;
        MyClass1<Double> ob2 = consFactory(myClassCons2, 102.34);

        MyFunc<MyClass2, String> myClassCons3 = MyClass2 :: new;
        MyClass2 ob3 = consFactory(myClassCons3, "Lambda");

        System.out.println("Values of integer, double and string: "
                + ob1.getVal() + " " + ob2.getVal() + " " + ob3.getStr());
    }
}
