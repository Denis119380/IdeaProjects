package NonGeneralization;

class NonGenDemo {
    public static void main(String[] args) {
        NonGen num;
        num = new NonGen(100);
        num.showType();
        int val = (Integer) num.getOb(); // без приведения типов (Integer) не компилируется
        System.out.println(val);


        NonGen str = new NonGen("NonGeneralization");
        System.out.println(str.getOb());
        str.showType();

        num = str;
        val = (Integer) num.getOb(); // данная конструкция приведёт к ошибке во время выполнения программы
                                     // java.lang.ClassCastException

    }

}
