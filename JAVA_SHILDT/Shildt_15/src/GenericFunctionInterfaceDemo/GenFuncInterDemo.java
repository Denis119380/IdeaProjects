package GenericFunctionInterfaceDemo;

class GenFuncInterDemo {
    public static void main(String[] args) {
        GenericInterface<Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) result *= i;
            return result;
        };
        System.out.println("Factorial of 5 equal: " + factorial.func(5));

        GenericInterface<String> str = n -> {
            String result = "";
            int i;
            for (i = (n.length() - 1); i >= 0; i--) result += n.charAt(i);
            return result;
        };
        System.out.println("Zoo rotation to: " + str.func("Zoo"));
    }
}
