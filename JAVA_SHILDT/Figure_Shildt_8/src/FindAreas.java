class FindAreas {
    public static void main(String[] args) {

//        Figure f = new Figure(10, 10); // недопустимо - Figure абстрактный класс
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure fig; // верно, хотя объект не создаётся

        fig = r;
        System.out.println("Площадь равна " + fig.area());

        fig = t;
        System.out.println("Площадь равна " + fig.area());

//        fig = f;
//        System.out.println("Площадь равна " + fig.area());
    }
}