package EnumDemo2;
// Использовать конструктор, переменную экземпляра
// и метод в перечислении
enum Apple {
    Jonathan(10), GoldenDel(9), RedDel,
    Winesap(15), Cortland(8);

    private int price; // переменная экземпляра, служит для
                       // хранения цены яблока каждого сорта

    // Конструктор вызывается один раз
    // для каждой константы перечислимого типа
    Apple(int price) {
        this.price = price;
    }

    // Перегружаемый конструктор -
    // конструктор по умолчанию, для RedDel устанавливается
    // значение -1
    Apple() {
        this.price = -1;
    }

    int getPrice() {
        return price;
    }
}
