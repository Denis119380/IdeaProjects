public class Main {
    public static void main(String[] args) {

        Vector2D v1 = new Vector2D(1,1, 2, 3);
        Vector2D v2 = new Vector2D(1, 1, 3, 4);
        Vector3D v11 = new Vector3D(1, 1, 1, 4, 4, 4);
        Vector3D v12 = new Vector3D(2, 3, 4, 4, 5, 6);
        System.out.println(v1.getVectorCords());
        System.out.println(v1.getLength());
        System.out.println(v1.getScalarProduct(v2));
        System.out.println(v1.getAngle(v2));
        System.out.println(v11.getVectorCords());
        System.out.println(v11.getLength());
        System.out.println(v11.getScalarProduct(v12));
    }
}