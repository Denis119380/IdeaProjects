public class DefaultMethodDemo {

    public static void main(String[] args) {

        MyIFImp1 obj1 = new MyIFImp1();
        MyIFImp2 obj2 = new MyIFImp2();

        System.out.println(obj1.getNumber());
        System.out.println(obj1.getString()); // метод по умолчанию
        System.out.println();
        System.out.println(obj2.getString()); // метода собственной реализации
    }
}
