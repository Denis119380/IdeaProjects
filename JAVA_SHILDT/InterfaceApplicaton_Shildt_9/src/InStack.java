interface InStack {

    void push(int item); // сохранить элемент в стеке

    int pop(); // извлечь элемент из стека

    default int clear() { // метод с реализацией по умолчанию
        System.out.println("Метод clear() не реализован.");
        return 0;
    }
}
