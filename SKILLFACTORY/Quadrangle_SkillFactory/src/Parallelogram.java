public class Parallelogram extends Quadrangle implements Figure{

    double alpha, beta;

    public Parallelogram(int a, int b, double alpha, double beta, String color) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double getLargeDiagonal() {
        return Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(beta));
    }

    @Override
    public String getColor() {
        return "color";
    }

    @Override
    public double getHeight() {
        return b * Math.sin(alpha);
    }

    @Override
    public double area() {
        return a * getHeight();
    }

    @Override
    public double perimeter() {
        return 2 * a + 2 * b;
    }
}