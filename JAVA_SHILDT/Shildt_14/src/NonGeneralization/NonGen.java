package NonGeneralization;

// класс без обобщений, но функциональный эквивалент (демонстрация недостатков)
class NonGen {
    Object ob;
    NonGen(Object ob) {
        this.ob = ob;
    }

    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println(ob.getClass().getName());
    }
}
