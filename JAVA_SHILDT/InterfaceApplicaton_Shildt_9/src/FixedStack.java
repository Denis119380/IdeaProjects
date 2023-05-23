// Реализация интерфейса InStack для стека
// фиксированного размера
class FixedStack implements InStack {

    private int stk[];
    private int tos;

    // выделить память и инициализировать стек
    FixedStack(int size) {
        stk = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    public void push(int item) {
        if(tos == stk.length-1) // использовать поле длины стека
            System.out.println("Стек заполнен.");
        else
            stk[++tos] = item;
    }

    // извлечь элемент из стека
    public int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stk[tos--];
    }
}
