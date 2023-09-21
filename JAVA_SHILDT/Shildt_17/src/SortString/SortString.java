package SortString;
// Пузырьковая сортировка объектов типа String
public class SortString {
    static String[] arr = new String[] {"now", "is", "the", "time", "for", "all",
                                 "good", "men", "to", "come", "to", "the",
                                 "aid", "of", "their", "country"};

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[i]) < 0) { // если compareToIgnoreCase(), то без учёта регистра символов
                    String str = arr[j];
                    arr[j] = arr[i];
                    arr[i] = str;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
