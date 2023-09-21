public class OverloadCons2 {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 15);
        Box box2 = new Box();
        Box cube = new Box(7);

        Box clone = new Box(box1);

        double vol;

        vol = box1.volume();
        System.out.println("box1 = " + vol);

        vol = box2.volume();
        System.out.println("box2 = " + vol);

        vol = cube.volume();
        System.out.println("cube = " + vol);

        vol = clone.volume();
        System.out.println("clone = " + vol);
    }
}