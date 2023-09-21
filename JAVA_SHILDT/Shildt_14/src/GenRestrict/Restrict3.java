package GenRestrict;

class Restrict3<T extends Number> {
    T ob;
    T[] arr;
    Restrict3(T ob, T[] arr) {
        this.ob = ob;
//        arr = new T[10]; // Неверно!
        this.arr = arr;
    }
}
class GenArray {
    public static void main(String[] args) {
        Integer[] iArr = new Integer[] {1, 2, 3, 4, 5};
        Restrict3<Integer> obArr = new Restrict3<>(101, iArr);

//        Restrict3<Integer>[] errArr = new Restrict3<>[5]; // Неверно!
        Restrict3<?>[] rightArr = new Restrict3<?>[5];
    }
}
