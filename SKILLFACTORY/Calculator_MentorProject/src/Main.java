import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 3) {
            System.out.println("Результат: " + calculate(inputOperand1(), inputOperation(), inputOperand2()));
            i++;
        }
    }
    private static int inputOperand1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый операнд: ");
        int operand1 = 0;
        try {
            operand1 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введено не число: ");
        }
        return operand1;
    }
    private static char inputOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию: ");
        char operation = 0;
        try {
            operation = scanner.next().charAt(0);
        } catch (InputMismatchException e) {
            System.out.println("Введена не операция: ");
        }
        return operation;
    }
    private static int inputOperand2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите второй операнд: ");
        int operand2 = 0;
        try {
            operand2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введено не число: ");
        }
        return operand2;
    }
    private static int calculate(int operand1, char operation, int operand2) {
       int result = 0;
       try {
           result = switch(operation) {
               case '+' -> operand1 + operand2;
               case '-' -> operand1 - operand2;
               case '*' -> operand1 * operand2;
               case '/' -> operand1 / operand2;
               default -> 0;
           };
       } catch (ArithmeticException e) {
           System.out.println("Произведено деление на 0");
       }
       return  result;
    }
}
