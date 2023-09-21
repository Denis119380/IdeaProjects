public class Vector2D extends Vector {

    public Vector2D(int x1, int y1, int x2, int y2) {
        super(x1, y1, 0, x2, y2, 0);
    }
    @Override
    public double getLength() {
        double res = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        return Math.sqrt(res);
    }
    @Override
    public String getVectorCords() {
        return ((x2 - x1) + ", " + (y2 - y1));
    }

    public double getScalarProduct(Vector2D vector) {
        double x = vector.x2 - vector.x1;
        double y = vector.y2 - vector.y1;
        double res = ((x2 - x1) * x) + ((y2 - y1) * y);
        return res;
    }

    public double getAngle(Vector2D vector) {
        if (this.getLength() == 0 || vector.getLength() == 0) return -2;
        return getScalarProduct(vector) / (this.getLength() * vector.getLength());
    }
}