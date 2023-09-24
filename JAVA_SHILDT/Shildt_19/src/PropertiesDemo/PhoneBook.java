package PropertiesDemo;

import java.io.*;
import java.util.Properties;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fileInputStream = null;
        boolean changed = false;

        // Try to open file phonebook.dat
        try {
            fileInputStream = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
            System.out.println("File don't founded.");
        }

        // If phonebook exists then number phones loading.
        try {
            if (fileInputStream != null) {
                properties.load(fileInputStream);
                fileInputStream.close();
            }
        } catch (IOException e) {
            System.out.println("Error read file.");
        }

        // Allow the user to enter new name and phone number.
        do {
            System.out.println("Enter name " + "(if enter 'exit' then out).");
            name = bufferedReader.readLine();
            if (name.equals("exit")) continue;
            System.out.println("Enter number: ");
            number = bufferedReader.readLine();
            properties.put(name, number);
            changed = true;
        } while (!name.equals("exit"));

        // If phonebook changed then need save it.
        if (changed) {
            FileOutputStream fileOutputStream = new FileOutputStream("phonebook.dat");
            properties.store(fileOutputStream, "Book of the phone numbers.");
            fileOutputStream.close();
        }

        // Search for a number by subscriber name.
        do {
            System.out.println("Enter name for search " + "(if enter 'exit' then out).");
            name = bufferedReader.readLine();
            if (name.equals("exit")) continue;
            number = (String) properties.get(name);
            System.out.println(number);
        } while (!name.equals("exit"));
    }
}
