package InstanceMethWithObjectRefDemo;

class InstanceMethWithObjectRefDemo {
    static <T> int count(T[] t, MyFunc<T> f, T t1) {
        int count = 0;
        for (int i = 0; i < t.length; i++)
            if (f.func(t[i], t1)) count++;
        return count;
    }

    public static void main(String[] args) {
        int count;
        HighTemp[] obTem1 = {
                new HighTemp(100), new HighTemp(101),
                new HighTemp(99), new HighTemp(100),
                new HighTemp(98), new HighTemp(101),
                new HighTemp(99), new HighTemp(100)};

        count = count(obTem1, HighTemp :: sameTem, new HighTemp(101));
        System.out.println("Quantity of temperatures equals 101: " + count);

        count = count(obTem1, HighTemp :: lessThenTem, new HighTemp(101));
        System.out.println("Quantity of temperatures less than 101: " + count);
    }
}
