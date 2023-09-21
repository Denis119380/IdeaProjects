class Rectangle extends Figure{

    Rectangle (double a, double b) {
        super(a, b);
    }

    // переопределить метод area() для четырёхугольника
    @Override
    double area() {
        System.out.println("В области четырёхугольника");
        return dim1 * dim2;
    }
}
