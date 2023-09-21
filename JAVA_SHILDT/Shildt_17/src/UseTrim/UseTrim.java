package UseTrim;
import java.io.*;
class UseTrim {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String str;
        System.out.println("Type 'stop' to complete.");
        System.out.println("Enter state name: ");

        do {
            str = br.readLine();
            str = str.trim(); // delete break-space
            if (str.equals("Illinois"))
                System.out.println("Capital - Springfield.");
            else if (str.equals("Missouri"))
                System.out.println("Capital - Jefferson city.");
            else if (str.equals("California"))
                System.out.println("Capital - Sacramento.");
            else if (str.equals("Washington"))
                System.out.println("Capital - Olympia.");
            // ...
        } while (!str.equals("stop"));
    }
}
