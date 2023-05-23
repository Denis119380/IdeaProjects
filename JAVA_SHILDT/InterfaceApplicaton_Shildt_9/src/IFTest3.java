// Используются обе реализации данного интерфейса в
// классах FixedStack и DynStack

/* Создать переменную интерфейса и
   обратиться к стекам через неё. */
class IFTest3 {
    public static void main(String[] args) {
        InStack stack;
        // создать переменную ссылки на интерфейс
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        stack = ds; // загрузить динамический стек
        // разместить числа в стеке
        for (int i = 0; i < 12; i++) stack.push(i);

        stack = fs; // загрузить фиксированный стек
        for (int i = 0; i < 8; i++) stack.push(i);

        stack = ds;
        System.out.println("Значения в динамическом стеке:");
        for (int i = 0; i < 12; i++)
            System.out.println(stack.pop());

        stack = fs;
        System.out.println("Значения в фиксированном стеке:");
        for (int i = 0; i < 8; i++)
            System.out.println(stack.pop());
    }
}
// Поиск вариантов при вызове методов push() и pop() осуществляется во время выполнения,
// а не во время компиляции.