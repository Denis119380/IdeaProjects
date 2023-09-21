public class Main {
    public static void main(String[] args) {

        Separator sep = new Separator(new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        for (int i = 0; i < sep.evenMethod().length; i++) {
            System.out.print(sep.evenMethod()[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < sep.oddMethod().length; i++) {
            System.out.print(sep.oddMethod()[i] + ", ");
        }
    }
}
