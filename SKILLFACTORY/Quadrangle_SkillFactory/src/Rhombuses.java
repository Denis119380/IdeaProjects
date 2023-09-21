public class Rhombuses extends Quadrangle implements Figure{

    double alpha, beta;

    public Rhombuses(int a, double alpha, double beta, String color) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double getLargeDiagonal() {
        return 2 * a * Math.cos(alpha / 2);
    }

    @Override
    public String getColor() {
        return "color";
    }

    @Override
    public double getHeight() {
        return a * Math.sin(alpha);
    }

    @Override
    public double area() {
        return a * getHeight();
    }

    @Override
    public double perimeter() {
        return 4 * a;
    }
}