class Outer {

    int outer_x = 100;

    void test1(){
        Inner1 inner = new Inner1(); // внутренний класс Inner1 определяется в области действия класса Outer
        inner.display();             // вызов метода display() класса Inner1
    }

    class Inner1 { // внутренний класс

        int y = 10; // локальная переменная класса Inner1 и
                    // недоступна за пределами этого класса

        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }

    void showy() {
//        System.out.println(y); // ошибка, потому что переменная y недоступна для класса Outer
    }

    void test2() {
        for (int i = 0; i < 10; i++) {
            class Inner2 {
                void display() {
                    System.out.println("display outer_x = " + outer_x);
                }
            }
            Inner2 inner2 = new Inner2();
            inner2.display();
        }
    }
}
