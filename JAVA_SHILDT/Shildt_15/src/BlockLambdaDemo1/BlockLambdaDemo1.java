package BlockLambdaDemo1;

class BlockLambdaDemo1 {
    public static void main(String[] args) {
        StrFunc str = n -> {
            String result = "";
            int i;
            for (i = (n.length() - 1); i >= 0; i--) result += n.charAt(i);
            return result;
        };
        System.out.println("Lambda rotation to: " + str.func("Lambda"));
        System.out.println("Go-go-go rotation to: " + str.func("Go-go-go"));
        System.out.println("Hello rotation to: " + str.func("Hello"));
    }
}
