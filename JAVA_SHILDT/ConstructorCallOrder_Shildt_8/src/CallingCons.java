// Демонстрация порядка вызова конструкторов
class  A {
    A() {
        System.out.println("Вызов конструктора A");
    }
}

class B extends A {
    B() {
        System.out.println("Вызов конструктора B");
    }
}

class C extends B {
    C() {
        System.out.println("Вызов конструктора C");
    }
}

class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}