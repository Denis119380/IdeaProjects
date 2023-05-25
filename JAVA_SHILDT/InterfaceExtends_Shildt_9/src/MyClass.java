// Этот класс должен реализовать все методы
// из интерфейсов A и B
class MyClass implements B, C{

    public void meth1() {
        System.out.println("Реализация метода meth1().");
    }

    public void meth2() {
        System.out.println("Реализация метода meth2().");
    }

    public void meth3() {
        System.out.println("Реализация метода meth3().");
    }

    public void meth5() {
        System.out.println("Реализация метода meth5().");
    }

//    public int meth4() { // метод приоритетный над его реализацией в интерфейсах
//        return 2;
//    }
}
