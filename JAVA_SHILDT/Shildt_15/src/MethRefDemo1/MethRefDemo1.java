package MethRefDemo1;

class MethRefDemo1 {
    static String strOps(StrFunc str, String s) {
        return str.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda expressions are effective.";
        String outStr;

        MyStrOps obStrOps = new MyStrOps();

        outStr = strOps(obStrOps :: reversMeth, inStr);
        System.out.println("Expression before: " + inStr);
        System.out.println("Expression after: " + outStr);
    }
}
