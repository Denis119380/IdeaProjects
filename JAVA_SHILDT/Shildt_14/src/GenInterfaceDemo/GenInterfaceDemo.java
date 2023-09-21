package GenInterfaceDemo;

class GenInterfaceDemo {
    public static void main (String[] args) {
        Integer[] n = new Integer[] {5, 2, 9, 3, 1, 6};
        Character[] ch = new Character[] {'j', 'r', 'a', 'e', 'z'};

        MyClass<Integer> numOb = new MyClass<Integer>(n);
        MyClass<Character> chrOb = new MyClass<Character>(ch);

        System.out.println("Min value into array n to equal: " + numOb.min());
        System.out.println("Max value into array n to equal: " + numOb.max());

        System.out.println()
        ;
        System.out.println("Min value into array ch to equal: " + chrOb.min());
        System.out.println("Max value into array ch to equal: " + chrOb.max());
    }
}
