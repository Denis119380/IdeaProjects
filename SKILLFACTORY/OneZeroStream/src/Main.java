import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(new OneZeroStream());
        // вероятно, экземпляр класса OneZeroStream "автоматически" реализует метод read(),
        // который возвращает байт, и этот байт используется для вывода в консоль
        // методом nextIn() экземпляра scanner
        // Метод nextIn() не принимает примитивные переменные,
        // а принимает объекты, поэтому для передачи 1, 0 и пробел использовали массивы
        for (int i = 0; i < 10; i++){
            System.out.print(scanner.nextInt());
        }
    }

}
