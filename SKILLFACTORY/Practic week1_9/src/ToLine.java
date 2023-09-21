public class ToLine {
    int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }
    int[] resize() {
        int[] res = new int[data.length * data[0].length];
        int start = 0;
        for (int[] datum : data) {
            for (int j = 0; j < datum.length; j++) {
                res[start + j] = datum[j];
            }
            start = start + datum.length;
        }
        return res;
    }
}
