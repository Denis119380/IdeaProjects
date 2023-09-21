package HierGenSubClass;

class Gen<T> extends NonGen {
    T ob;
    Gen(T ob, int i) {
        super(i);
        this.ob = ob;
    }
    T getOb() {
        return ob;
    }
}
