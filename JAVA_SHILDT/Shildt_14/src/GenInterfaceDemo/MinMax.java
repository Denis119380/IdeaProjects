package GenInterfaceDemo;

interface MinMax <T extends Comparable<T>> {
    T min();
    T max();
}
