class StaticDemo {

    static int a = 10;
    static int b;
    int c = 100;

    static void meth(int x) {
        System.out.println("x :" + x);
        System.out.println("a :" + a);
        System.out.println("b :" + b);
//        System.out.println("c :" + c);
//        System.out.println(print());
//        System.out.println(this.a);
        System.out.println(printStatic());
    }

    static { // статический блок используется для инициализации статических переменных
        System.out.println("Статический блок инициализирован.");
        b = a * 2;
    }

    String print() {
        return "No static method.";
    }

    static String printStatic() {
        return "Static method.";
    }
}
