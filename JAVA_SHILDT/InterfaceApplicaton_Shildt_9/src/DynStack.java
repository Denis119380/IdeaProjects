// реализация наращиваемого стека
class DynStack implements InStack{

    private int[] stk;
    private int tos;

    // выделить память и инициализировать стек
    DynStack (int size) {
        stk = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    public void push(int item) {
        // если стек заполнен, выделить память
        // под стек большего размера
        if (tos == stk.length-1) {
            int temp[] = new int[stk.length * 2];
            // удвоить размер стека
            for (int i = 0; i < stk.length; i++) temp[i] = stk[i];
            stk = temp;
            stk[++tos] = item;
        }
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
