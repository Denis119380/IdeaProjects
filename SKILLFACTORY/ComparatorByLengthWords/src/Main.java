import java.util.Arrays;
import java.util.Comparator;

class ComparatorByLength implements Comparator<String> {

    @Override
    public int compare(String arg0, String arg1) {
        if (arg0 == null)
            return 1;
        if (arg1 == null)
            return -1;
        return arg0.length() - arg1.length();
    }
}


public class Main {

    public static void main(String[] args) { // Сортировка слов по количеству букв
        String[] array = {"Brt", "AD", "From"};
        Arrays.sort(array, new ComparatorByLength());
        System.out.println(Arrays.toString(array));
    }
}