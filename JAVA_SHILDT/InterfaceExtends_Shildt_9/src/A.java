// Один интерфейс может расширять другой
interface A {
    void meth1();
    void meth2();

    default int meth4() {
        return 0;
    }
}
