public class Main {
    public static void main(String[] args) {
        Squirrel s = new Squirrel(new int[] {2, 5, -3, -1});
        System.out.println(s.maxNuts());
        Squirrel s2 = new Squirrel(new int[] {-1, -2, 4, 1, 0, -2, -3, -1, -1, 10});
        System.out.println(s2.maxNuts());
        System.out.println(s2.getNuts(1));
    }
}