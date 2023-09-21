package GenericMethRefDemo;

class MyArrayOps {
    static <T> int countMatching(T[] val, T v) {
        int count = 0;
        for (int i = 0; i < val.length; i++)
            if (val[i] == v) count++;
        return count;
    }
}
