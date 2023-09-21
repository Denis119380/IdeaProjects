public class App { // демонстрация статической переменной
    static int a = 0;
    int b = 0;

    public static void main(String[] args) {
        App app1 = new App();
        App app2 = new App();
        app1.a++;
        app2.a++;
        System.out.println(app2.a);
        app1.b++;
        app2.b++;
        System.out.println(app2.b);
    }
}