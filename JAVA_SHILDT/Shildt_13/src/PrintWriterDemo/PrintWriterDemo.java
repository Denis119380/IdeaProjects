package PrintWriterDemo;

import java.io.PrintWriter;

// Продемонстрировать класс PrintWriter
public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter br = new PrintWriter(System.out, true);

        br.println("This string");
        int i = -7;
        br.println(i);
        double d = 4.5e-7;
        br.println(d);
    }
}
