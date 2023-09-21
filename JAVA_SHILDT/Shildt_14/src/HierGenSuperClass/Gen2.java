package HierGenSuperClass;

class Gen2<T, V> extends Gen<T> {
    V obV;
    Gen2(T ob, V obV) {
        super(ob);
        this.obV = obV;
    }
    V getObV() {
        return obV;
    }
}
