package ClassDemo;

public class Main {
    // продемонстрировать получение сведенийй о типе объекта
    // во время выполнения
    public static void main(String[] args) {
        X ob1 = new X();
        Y ob2 = new Y();
        Class<?> ob3;
        ob3 = ob1.getClass(); // получить ссылку на объект типа Class
        System.out.println("ob1 object of class: " + ob3.getName());

        ob3 = ob2.getClass();
        System.out.println("ob2 object of class: " + ob3.getName());

        ob3 = ob3.getSuperclass();
        System.out.println("Super class of ob2 is: " + ob3.getName());
    }
}
