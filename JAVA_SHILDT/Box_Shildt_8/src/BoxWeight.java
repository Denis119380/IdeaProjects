class BoxWeight extends Box{

    double weight; // вес параллелепипеда

    // сконструировать клон объекта
    BoxWeight(BoxWeight ob) { // передать объект конструктору
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
//        width = w; // не эффективно, т.к. ведёт к дублированию кода
//        height = h; // кроме того, у подкласса есть доступ к членам суперкласса
//        depth = d;
        super(w, h, d); // вызвать конструктор суперкласса
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
