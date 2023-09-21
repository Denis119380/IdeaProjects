package MethRefDemo;

class MethRefDemo {
    static String strOps(StrFunc str, String s) {
        return str.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda expressions improve efficiency of Java.";
        String outStr;

        outStr = strOps(MyStrOps :: reversMeth, inStr);
        System.out.println("Expression before using: " + inStr);
        System.out.println("Expression after using: " + outStr);
    }
}
