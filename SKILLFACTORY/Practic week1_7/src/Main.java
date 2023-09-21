public class Main {
    public static void main(String[] args) {

        LimitingRectangle p = new LimitingRectangle(new int[][] {{-1, -2}, {3, 4}, {-2, 2}, {2, -3}, {4, 2}});
        System.out.println(p.getDifValFirst() + ", " + p.getDifValSecond());
        System.out.println(p.getBorders());
    }
}
