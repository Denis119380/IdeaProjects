package ReaderAndWriter;

import java.io.*;
import java.nio.charset.Charset;

public class Main { // программа перекодировщик, копирует файлы и при этом меняет кодировку
                    // с windows-1251 на UTF-8

    public static void main(String[] args) throws IOException {
        copyFileUsingStream(new File("src/ReaderAndWriter/win1251.txt"),
                Charset.forName("windows-1251"),
                new File("src/ReaderAndWriter/utf8.txt"),
                Charset.forName("utf-8"));
    }

    private static void copyFileUsingStream(File source, Charset sourceEnc, File dest, Charset destEnc)
        throws IOException {

        Reader fis = new FileReader(source, sourceEnc); // создание экземпляра класса Reader,
                                                        // для считывания символьных потоков

        Writer fos = new FileWriter(dest, destEnc);     // создание экземпляра класса Writer,
                                                        // для записывания символьных потоков

        char[] buffer = new char[1024]; // массив используется типа char
        int length;
        while ((length = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }
        fis.close(); fos.close();
    }
}
