package BoundWildcard;

class Cords<T extends TwoD> {
    T[] ob;
    Cords(T[] ob) {
        this.ob = ob;
    }
}
