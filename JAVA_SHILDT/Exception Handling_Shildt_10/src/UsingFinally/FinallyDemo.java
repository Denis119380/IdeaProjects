package UsingFinally;

public class FinallyDemo { // продемонстрировать оператор finally

    // сгенерировать исключение в методе
    static void methA() {
        try {
            System.out.println("В теле метода methA().");
            throw new RuntimeException("демонстрация");
        } finally {
            System.out.println(
                    "Блок оператора finally в методе methA()"
            );
        }
    }

    // возвратить управление из блока оператора try
    static void methB() {
        try {
            System.out.println("В теле метода methB()");
            return;
        } finally {
            System.out.println(
                    "Блок оператора finally в методе methB()"
            );
        }
    }

    // выполнить блок try, как обычно
    static void methC() {
        try {
            System.out.println("В теле метода methC()");
        } finally {
            System.out.println(
                    "Блок оператора finally в методе methC()"
            );
        }
    }

    public static void main(String[] args) {
        try {
            methA();
        } catch (Exception e) {
            System.out.println("Исключение перехвачено " + e);
        }

        methB();
        methC();
    }
}
