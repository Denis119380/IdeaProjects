class Stack { // стек один из примеров инкапсуляции, глава 6 Герберт Шилдт
    private int[] stack; // модификатор доступа private
    private int tos;

    Stack(int size) {
        stack = new int[size];
        tos = -1;
    }

    void push(int item) { // операция размещения в стеке
        if(tos==stack.length - 1)
            System.out.println("Стек заполнен.");
        else
            stack[++tos] = item;
    }

    int pop() { // операция извлечения из стека
        if(tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stack[tos--];
    }
}