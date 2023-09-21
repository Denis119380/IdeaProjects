public class Separator {

    int[] array;
    int k;
    public Separator(int[] array) {
        this.array = array;
    }

    public int[] evenMethod() {
        int o = 0;
        int e = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) e++;
        }
        int[] even = new int[e];
        for (int i = 0; i < array.length; i++) {
            k = array[i] / 2;
            if (array[i] == 2 * k) {
                even[o] = array[i];
                o++;
            }
        }
        return even;
    }

    public int[] oddMethod() {
        int o = 0;
        int e = 0;
        for (int i = 0; i < array.length; i++) {
            k = array[i] / 2;
            if (array[i] != 2 * k) e++;
        }
        int[] odd = new int[e];
        for (int i = 0; i < array.length; i++) {
            k = array[i] / 2;
            if (array[i] != 2 * k) {
                odd[o] = array[i];
                o++;
            }
        }
        return odd;
    }
}
//    int[] array;
//
//    public Separator(int[] array) {
//        this.array = array;
//    }
//
//    int[] even() {
//        int k = 0, now = 0; // считаем количество элементов
//        for (int i : array) {
//            if (i % 2 == 0) k++;
//        }
//
//        int[] evens = new int[k];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                evens[now] = array[i]; // заполняем новый массив
//                now += 1;
//            }
//        }
//        return evens;
//    }
//
//    int[] odd() {
//        int k = 0, now = 0; // считаем количество элементов
//        for (int i : array) {
//            if (i % 2 != 0) k++;
//        }
//
//        int[] odds = new int[k];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
//                odds[now] = array[i]; // заполняем новый массив
//                now += 1;
//            }
//        }
//        return odds;
//    }
//}