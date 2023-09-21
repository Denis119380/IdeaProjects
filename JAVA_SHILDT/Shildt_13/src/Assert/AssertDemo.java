package Assert;
// Продемонстрировать применение оператора assert
// Чтобы разрешить проверку, следует в командной строке
// указать параметр -ea: java -ea AssertDemo.java
// отключить проверку: java -da AssertDemo.java
public class AssertDemo {
    static int val = 3;
    static int getNum() {
        return val--;
    }

    public static void main(String[] args) {
        int n = 0;
        for (int i = 0; i < 10; i++) {
            n = getNum();
            assert n > 0: "n отрицательное!"; // не подтвердится, если n == 0
            System.out.println("n равно: " + n);
        }
    }
}
