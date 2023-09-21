package GenMethDemo;

class GenMethDemo {
    // пример обобщённого метода isOb()
    static <T extends Comparable<T>, V extends T> boolean isOb(T ob, V[] arrOb) {
        for (int i = 0; i < arrOb.length; i++)
            if (ob.equals(arrOb[i])) return true;
        return false;
    }

    public static void main(String[] args) {
        Integer[] num = new Integer[] {1, 2, 3, 4, 5};
        if (isOb(2, num)) System.out.println("Value 2 is object to array num.");
        if (!isOb(7, num)) System.out.println("Value 7 is not object to array num");

        System.out.println(isOb(6, num));

        String[] str = new String[] {"1", "2", "3", "4", "5"};
        if (isOb("4", str)) System.out.println("String 4 is object to array str.");

//        if (isOb("3", num)) System.out.println(); // Код не компилируется т.к. параметризированный тип V
                                                    // (Integer) не является типом класса или подкласса типа T
                                                    // (String)
    }
}
