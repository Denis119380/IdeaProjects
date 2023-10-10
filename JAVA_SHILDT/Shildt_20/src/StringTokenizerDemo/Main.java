package StringTokenizerDemo;

import java.util.StringTokenizer;

public class Main {
    static String string = "Title=Java.Instruction;" + "Author=Shildt;" + "Press=OraclePress;";

    public static void main(String[] args) {
        StringTokenizer str = new StringTokenizer(string, "=;");
        while (str.hasMoreElements()) {
            String key = str.nextToken();
            String value = str.nextToken();
            System.out.println(key + "\t" + value);
        }
    }
}
