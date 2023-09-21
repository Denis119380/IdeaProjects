package EnumDemo2;

class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap; // конструктор Apple() вызывается один раз
                  // для каждой объявленной константы

        // вывести цену на яблоко сорта Winesap
        System.out.println("Яблоко сорта Winesap стоит "
                            + Apple.Winesap.getPrice()
                            + " центов.\n");
        // вывести цены на все сорта яблок
        System.out.println("Цены на все сорта яблок: ");
        for (Apple a : Apple.values())
            System.out.println(a + " стоит " + a.getPrice()
                               + " центов.");
    }
}
