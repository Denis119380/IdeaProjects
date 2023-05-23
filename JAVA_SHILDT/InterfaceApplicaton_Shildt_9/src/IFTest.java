// Реализация версии целочисленного стека фиксированной длины
public class IFTest {

    public static void main(String[] args) {
        FixedStack stack1 = new FixedStack(5);
        FixedStack stack2 = new FixedStack(8);

        // разместить числа в стеке
        for (int i = 0; i < 5; i++) stack1.push(i);
        for (int i = 0; i < 8; i++) stack2.push(i);

        // извлечь эти числа из стека
        System.out.println("Стек в stack1:");
        for (int i = 0; i < 5; i++)
            System.out.println(stack1.pop());

        System.out.println("Стек в stack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(stack2.pop());
    }
}
