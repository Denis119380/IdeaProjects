// Реализация версии целочисленного динамического стека
// Т.е. когда возникает потребность в дополнительном
// свободном месте, размер стека удваивается.
public class IFTest2 {

    public static void main(String[] args) {
        DynStack stack1 = new DynStack(5);
        DynStack stack2 = new DynStack(8);

        // В этих циклах увеличиваются размеры каждого стека
        for (int i = 0; i < 12; i++) stack1.push(i);
        for (int i = 0; i < 20; i++) stack2.push(i);

        System.out.println("Стек в stack1:");
        for (int i = 0; i < 12; i++)
            System.out.println(stack1.pop());

        System.out.println("Стек в stack2:");
        for (int i = 0; i < 20; i++)
            System.out.println(stack2.pop());
    }
}
