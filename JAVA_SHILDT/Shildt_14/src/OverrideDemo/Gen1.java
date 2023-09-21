package OverrideDemo;

class Gen1<T> extends Gen<T> {
    Gen1(T ob) {
        super(ob);
    }
    @Override
    T getOb() {
        System.out.println("This is method of Gen1<T>");
        return ob;
    }
}
