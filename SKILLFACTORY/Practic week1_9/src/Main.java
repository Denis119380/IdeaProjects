import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ToTable toTable = new ToTable(new int[]{1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] arr = toTable.resize();
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

        ToLine toLine = new ToLine(new int[][]{{1, 2}, {3, 4}, {5, 6}});
        int[] ar = toLine.resize();
        for (int item : ar) {
            System.out.print(item + " ");
        }
    }
}