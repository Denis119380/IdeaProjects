package p2;

class Protection2 extends p1.Protection {

    Protection2() {
        System.out.println("Конструктор унаследованный из другого пакета");
        // доступ только для класса Protection или пакета
        // System.out.println("n = " + n);

        // доступно только для класса Protection
        // System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
