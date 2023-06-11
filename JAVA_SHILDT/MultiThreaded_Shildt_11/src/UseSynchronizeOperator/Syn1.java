package UseSynchronizeOperator;

class Syn1 {
    public static void main(String[] args) {
        Call target = new Call(); // данный экземпляр используется
        // в ниже приведённых конструкторах
        Caller ob1 = new Caller(target, "Welcome");
        Caller ob2 = new Caller(target, "in synchronized");
        Caller ob3 = new Caller(target, "world!");

        // ожидать завершения потока исполнения
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
    }
}
