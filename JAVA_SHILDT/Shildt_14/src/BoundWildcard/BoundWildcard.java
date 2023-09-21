package BoundWildcard;

class BoundWildcard {
    static void showXY(Cords<? extends TwoD> showOb) { // метод для установки верхней границы для метасимвола
        System.out.println("Координаты X и Y");
        for (int i = 0; i < showOb.ob.length; i++) {
            System.out.println(showOb.ob[i].x + " " + showOb.ob[i].y);
        }
    }

    static void showXYZHigh(Cords<? extends ThreeD> showOb) { // метод установки верхней границы для метасимвола
                                                          // до класса ThreeD и его наследующих классов
                                                          //  в данном случае FourD
        System.out.println("Координаты X, Y и Z");
        for (int i = 0; i < showOb.ob.length; i++) {
            System.out.println(showOb.ob[i].x + " " + showOb.ob[i].y + " " + showOb.ob[i].y);
        }
    }

    static void showXYZLow(Cords<? super ThreeD> showOb) { // метод установки нижней границы для метасимвола
                                                           // т.е. учитываются только суперклассы, в данном
                                                           // случае класс TwoD
        System.out.println("Координаты X и Y");
        for (int i = 0; i < showOb.ob.length; i++) {
            System.out.println(showOb.ob[i].x + " " + showOb.ob[i].y);
        }
    }

    static void showXYZT(Cords<? extends FourD> showOb) {
        System.out.println("Координаты X, Y, Z и время T");
        for (int i = 0; i < showOb.ob.length; i++) {
            System.out.println(showOb.ob[i].x + " " + showOb.ob[i].y + " " + showOb.ob[i].z + " " + showOb.ob[i].t);
        }
    }

    public static void main(String[] args) {
        TwoD[] twoD = new TwoD[] {new TwoD(1, 2), new TwoD(3, 4), new TwoD(-2, -5)};
        ThreeD[] threeD = new ThreeD[] {new ThreeD(4, 5, 6), new ThreeD(-2, -3, -6)};
        FourD[] fourD = new FourD[] {new FourD(1, 2, 3, 10), new FourD(-1, -2, -3, 60)};

        Cords<TwoD> twoOb = new Cords<TwoD>(twoD);
        Cords<ThreeD> threeOb = new Cords<ThreeD>(threeD);
        Cords<FourD> fourOb = new Cords<FourD>(fourD);

        showXYZT(fourOb);
        showXYZHigh(threeOb);
        showXY(twoOb);
        showXYZLow(twoOb);
    }
}
