package ParseDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ParseDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i;
        int sum = 0;
        System.out.println("If you want exit to type '0'.");
        do {
            str = br.readLine();
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Wrong format.");
                i = 0;
            }
            sum += i;
            System.out.println("The running total is: " + sum);
        } while (i != 0);
    }
}
