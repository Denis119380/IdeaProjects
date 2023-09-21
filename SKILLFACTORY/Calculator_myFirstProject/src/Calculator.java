import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int result = 0;
        for (int i = 0; i < 10; i++) {

            Scanner scanner = new Scanner(System.in);

            int operand1;
            if (result == 0) {
                System.out.println("Input operand1: ");
                if (scanner.hasNextInt()) {
                    operand1 = scanner.nextInt();
                    System.out.println("Thanks, you entered number: " + operand1);
                } else {
                    System.out.println("Sorry, this is not number");
                    continue;
                }

            } else {
                operand1 = result;
                System.out.println("Operand1: " + operand1);
            }

            System.out.println("Input operation: ");
            char operation = scanner.next().charAt(0);

            int a = 0;
                    switch (operation) {
                        case '+':
                            a = 1;
                            break;
                        case '-':
                            a = 2;
                            break;
                        case '*':
                            a = 3;
                            break;
                        case '/':
                            a = 4;
                            break;
                        default:
                            System.out.println("Uncorrect operation");
                            continue;
                    }
            System.out.println("Thanks, you entered operation: " + operation);

            int operand2;
            System.out.println("Input operand2: ");
            if (scanner.hasNextInt()) {
                operand2 = scanner.nextInt();
                System.out.println("Thanks, you entered number: " + operand2);
            } else {
                System.out.println("Sorry, this is not number");
                continue;
            }



            System.out.println("Reset? If 'c' - Ok: ");
            char reset = scanner.next().charAt(0);
            int c = 0;
            switch (reset) {
                case 'c':
                    c = 1;
                    break;
                default:
                    System.out.println("Uncorrect select");
            }
            if (c == 1) {
                result = 0;
                continue;
            }
            System.out.println("Exit? If 's' - Ok: ");
            char exit = scanner.next().charAt(0);
            int s = 0;
            switch (exit) {
                case 's':
                    s = 1;
                    break;
                default:
                    System.out.println("Uncorrect select");
            }
            if (s == 1) {
                break;
            }

            if (a == 1) {
                result = operand1 + operand2;
                System.out.println("Result: " + result);
            } else if (a == 2) {
                result = operand1 - operand2;
                System.out.println("Result: " + result);
            } else if (a == 3) {
                result = operand1 * operand2;
                System.out.println("Result: " + result);
            } else {
                if (operand2 == 0) {
                    System.out.println("But, you entered number: " + operand2);
                    continue;
                }
                result = operand1 / operand2;
                System.out.println("Result: " + result);
            }
        }
    }
}