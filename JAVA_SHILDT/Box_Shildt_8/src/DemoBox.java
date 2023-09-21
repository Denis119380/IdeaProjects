class DemoBox {
    public static void main(String[] args) {

        BoxWeight box1 = new BoxWeight(10, 20, 15, 45.3);
        Box plainbox = new Box();
        BoxWeight box2 = new BoxWeight(); // по умолчанию
        BoxWeight cube1 = new BoxWeight(3, 2.3);
        BoxWeight clone1 = new BoxWeight(box1);
        Shipment shipment1 = new Shipment(10, 10, 10, 3.45, 5);

        double vol;

        vol = box1.volume();
        System.out.println("Объём box1 равен: " + vol);
        System.out.println("Вес box1 равен: " + box1.weight);
        System.out.println();

        // присвоить переменной ссылки на объект типа BoxWeight
        // ссылку на объект типа Box
        plainbox = box1;
        vol = plainbox.volume();
        System.out.println("Объём plainbox равен: " + vol);
        System.out.println();

        /* Следующий оператор ошибочен, поскольку объект plainbox
        не определяет член weight.
         */
//        System.out.println("Вес plainbox равен: " + plainbox.weight);

        vol = box2.volume();
        System.out.println("Объём box2 равен: " + vol);
        System.out.println("Вес box2 равен: " + box2.weight);
        System.out.println();

        vol = clone1.volume();
        System.out.println("Объём clone1 равен: " + vol);
        System.out.println("Вес clone1 равен: " + clone1.weight);
        System.out.println();

        vol = shipment1.volume();
        System.out.println("Объём shipment1 равен: " + vol);
        System.out.println("Вес shipment1 равен: " + shipment1.weight);
        System.out.println("Стоимость shipment1 равен: " + shipment1.cost);
        System.out.println();
    }
}