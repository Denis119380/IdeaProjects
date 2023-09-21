public class Vector3D extends Vector {

    Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2);
    }
    @Override
    public double getLength() {
        double res = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)) + ((z2 - z1) * (z2 - z1));
        return Math.sqrt(res);
    }
    @Override
    public String getVectorCords() {
        return ((x2 - x1) + ", " + (y2 - y1) + ", " + (z2 - z1));
    }

    public double getScalarProduct(Vector3D vector) {
        double x = vector.x2 - vector.x1;
        double y = vector.y2 - vector.y1;
        double z = vector.z2 - vector.z1;
        return ((x2 - x1) * x) + ((y2 - y1) * y) + ((z2 - z1) * z);
    }
}