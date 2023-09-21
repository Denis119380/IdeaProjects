package HierGenInstanceOf;

public class HieGenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(99);
        Gen1<Integer> iOb1 = new Gen1<Integer>(101);
        Gen1<String> strOb1 = new Gen1<String>("Hello World!");

        if (iOb instanceof Gen<?>) System.out.println("iOb is object class Gen");
        if (iOb instanceof Gen1<?>) System.out.println("iOb is some form class Gen1"); // результат false

        if (iOb1 instanceof Gen<?>) System.out.println("iOb2 is some form class Gen");
        if (strOb1 instanceof Gen<?>) System.out.println("strOb1 is some form class Gen");

        if (iOb1 instanceof Gen1<Integer>) System.out.println("iOb1 is object class Gen1<Integer>");

    }
}
