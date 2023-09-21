package GenShortForm;

class Gen<T,V> {
    T ob1;
    V ob2;
    Gen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    boolean isSame(Gen<T,V> ob) {
        if (ob1 == ob.ob1 && ob2 == ob.ob2) return true;
        else return false;
    }
}
