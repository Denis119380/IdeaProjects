public class RecTest {

    int[] values;
    RecTest(int i) {
        values = new int[i];
    }

    void printArray(int i) {
        if(i == 0);
        else printArray(i - 1);
        System.out.println("[" + (i) + "] " + values[i]);
    }
}
