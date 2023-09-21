package BaseType;

class BaseTypeDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(100);
        Gen<String> strOb = new Gen<String>("Hello World!");

        // Создание объекта базового типа
        Gen raw = new Gen(new Double(23.4));
        double d = (Double) raw.getOb();
        System.out.println(d);

//        int i = (Integer) raw.getOb(); // ОШИБКА! во время выполнения

        strOb = raw;
//        String str = strOb.getOb(); // ОШИБКА! во время выполнения

        raw = iOb;
//        d = (Double) raw.getOb(); // ОШИБКА! во время выполнения
    }
}
