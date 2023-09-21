package LambdasAsArgumentDemo;

class LambdasDemo {
    static String strFunc(StringFunc str, String strIn) {
        return str.func(strIn);
    }

    public static void main(String[] args) {
        String inStr = "Lambda-expressions are the effective means of the Java language.";
        String outStr;
        System.out.println("Lambda-expressions are the effective means of the Java language.");

        outStr = strFunc(n -> n.toUpperCase(), inStr);
        System.out.println(outStr);

        outStr = strFunc(n -> {
            String result = "";
            for (int i = 0; i < inStr.length(); i++) {
                if (inStr.charAt(i) != ' ') result += inStr.charAt(i);
            }
            return result;
        }, inStr);
        System.out.println(outStr);

        StringFunc reverse = n -> {
            String result = "";
            int i;
            for (i = (inStr.length() - 1); i >= 0; i--) result += inStr.charAt(i);
            return result;
        };
        outStr = strFunc(reverse, inStr);
        System.out.println(outStr);
    }
}
