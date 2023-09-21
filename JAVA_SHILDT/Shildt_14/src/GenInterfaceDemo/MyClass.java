package GenInterfaceDemo;

class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] ob;
    MyClass(T[] ob) {
        this.ob = ob;
    }
    public T min() {
        T val = ob[0];
        for (int i = 1; i < ob.length; i++) {
            if (ob[i].compareTo(val) < 0) val = ob[i];
        }
        return val;
    }
    public T max() {
        T val = ob[0];
        for (int i = 0; i < ob.length; i++)
            if (ob[i].compareTo(val) > 0) val = ob[i];
        return val;
    }
}
