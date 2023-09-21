package StringConversions;

class StringConversions {
    public static void main(String[] args) {
        int num = 30;
        System.out.println("Number " + num + " in binary form: "
                           + Integer.toBinaryString(num));
        System.out.println("Number " + num + " in octal form: "
                           + Integer.toOctalString(num));
        System.out.println("Number " + num + " in hexadecimal form: "
                           + Integer.toHexString(num));
    }
}
