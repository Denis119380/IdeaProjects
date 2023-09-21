package GeneralizationSimpleExample;

class Gen<T> {
    // Gen - параметризированный тип;
    // T - имя параметра типа
    T ob;
    Gen(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println(ob.getClass().getName());
    }
}
