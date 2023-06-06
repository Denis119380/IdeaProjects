package UsingMyException;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            copyFileUsingStream(
                    "src/UsingMyException/win1251.txt",
                    "windows-1251",
                    "src/UsingMyException/utf8.txt",
                    "utf-8");
                System.out.println("Перекодировка выполненна успешно.");
    } catch (ConvertException ex) {
            // перехватываем исключение и сообщаем что произошло
            System.out.println(ex.getMessage());
        }
    }

    private static void copyFileUsingStream(
            String sourceFilename,
            String sourceEnc,
            String destFilename,
            String destEnc
    ) throws ConvertException {
        // когда используется опреатор throws
        // как правило тип метода void
        try (Reader fis = new InputStreamReader(new
                FileInputStream(new File(sourceFilename)),
                sourceEnc);
             Writer fos = new OutputStreamWriter(new
                     FileOutputStream(new File(destFilename)),
                     destEnc)) {

            char[] buffer = new char[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        }
        catch (FileNotFoundException ex) {
            // инициируем собственное исключение
            throw new ConvertException("Файл не найден." +
                    ex.getMessage());
        }
        catch (UnsupportedEncodingException ex) {
            // инициируем собственное исключение
            throw new ConvertException("Кодировка не верна." +
                    ex.getMessage());
        }
        catch (IOException ex) {
            // инициируем собственное исключение
            throw new ConvertException("Ошибка при копировании.");
        }
    }
}
