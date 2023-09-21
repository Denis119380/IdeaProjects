package EnumDemo;

class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println(
                "Константы перечислимого типа Apple: ");

        // применить метод values()
        Apple allApples[] = Apple.values();
        for (Apple a : allApples)
            System.out.println(a);

        System.out.println();
        // применить метод valueOf()
        ap = Apple.valueOf("RedDel");
        System.out.println("Переменная ap содержит " + ap);
    }
}
