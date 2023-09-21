package ConstrArrayRefDemo;

class ConstArrayDemo {
    public static void main(String[] args) {
        MyFunc<MyClass[]> myArrayCons = MyClass[]::new;
        MyClass[] ob1 = myArrayCons.func(3); // Параметр 3 указывает на размер массива
        ob1[0] = new MyClass(101);
        ob1[1] = new MyClass(102);
        ob1[2] = new MyClass(103);

        System.out.println("Values of array:");
        for (MyClass val : ob1) System.out.println(val.getInt());
    }
}
