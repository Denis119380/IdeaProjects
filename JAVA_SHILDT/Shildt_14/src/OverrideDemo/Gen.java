package OverrideDemo;

class Gen<T> {
    T ob;
    Gen(T ob) {
        this.ob = ob;
    }
    T getOb() {
        System.out.println("This is method of Gen<T>");
        return ob;
    }
}
