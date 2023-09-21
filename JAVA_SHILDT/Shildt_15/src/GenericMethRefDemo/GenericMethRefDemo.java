package GenericMethRefDemo;

class GenericMethRefDemo {
    static <T> int myOps(MyFunc f, T[] val, T v) {
        return f.func(val, v);
    }

    public static void main(String[] args) {
        int count;
        Integer[] iArr = {2, 3, 4, 5, 2, 3, 8, 9};
        String[] strArr = {"one", "two", "three", "four", "two", "three"};

        count = myOps(MyArrayOps :: countMatching, iArr, 3);
        System.out.println("Array iArr contents " + count + " times of number 3.");

        count = myOps(MyArrayOps :: countMatching, strArr, "two");
        System.out.println("Array strArr contents " + count + " times of string two.");
    }
}
