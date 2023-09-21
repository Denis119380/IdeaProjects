package GeneralizationSimpleExample;

class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> num; // Integer - аргумент типа

        // применение автоупаковки при инкапсуляции значения 100 в объект типа Integer
        // new Gen<Integer>(new Integer(100))
        num = new Gen<Integer>(100);
        System.out.println(num.getOb()); // метод getOb() возвращает тип Integer

        int val = num.getOb(); // тип Integer автоматически распаковывется в тип int
                               // int val = num.getOb().intValue();
        System.out.println(val);
        num.showType();

        Gen<String> str = new Gen<String>("Generalization");
        System.out.println(str.getOb());
        str.showType();

        // num = str; Пример типовой безопасности, данный код не компилируется - ошибка.
    }
}
