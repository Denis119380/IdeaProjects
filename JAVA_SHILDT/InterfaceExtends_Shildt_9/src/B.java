// Теперь интерфейс B включает в себя методы meth1()
// и meth2() и добавляет метод meth3()
interface B extends A{

    void meth3();

    default int meth4() {
        return A.super.meth4(); // ссылка на реализации в наследуемом интерфейсе
    }
}
