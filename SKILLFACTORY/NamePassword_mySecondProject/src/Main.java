import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean pass = true;
        while (pass){
            System.out.println("Введите имя: ");
            String name = scanner.nextLine();
            System.out.println("Введите пароль: ");
            String password = scanner.nextLine();
            String[] passwordArr = password.split("");
            System.out.println(checkPassword(passwordArr));
            switch (checkPassword(passwordArr)) {
                case "Пароль верный":
                    pass = false;
                    System.out.println("Ваше имя: " + name);
                    System.out.println("Ваш пароль: " + password);
                    break;
                default: break;
            }
        }
    }

    private static String checkPassword(String[] password) {
        String[] truePassword = {"b", "o", "d", "y", "b", "u", "t", "t", "e", "r"};
        String result;
        if (password.length > 15) {
            result = "Количество символов пароля превышено";
        } else if (password.length < 8) {
            result = "Количество символов пароля ниже допустимого";
        } else {
            boolean value = true;
            boolean value1 = Arrays.equals(truePassword, password);
            if (value == value1) {
                result = "Пароль верный";
            } else {
                result = "Пароль неверный";
            }
        }
        return result;
    }
}