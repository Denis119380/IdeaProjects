package UsingTryWithResources;

import java.io.*;

class Main {
    public static void main(String[] args) {
        if (copyFileUsingStream(
                "src/UsingTryWithResources/win1251.txt",
                "windows-1251",
                "src/UsingTryWithResources/utf8.txt",
                "utf-8")) {
            System.out.println("Перекодировка выполненна успешно.");
        }
    }

    private static boolean copyFileUsingStream(
            String sourceFilename,
            String sourceEnc,
            String destFilename,
            String destEnc
    ) {
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
            System.out.println("Файл не найден." +
                    ex.getMessage());
            // метод getMessage() укажет какой файл не найден,
            // источника (source) или назначения (dest)
            return false;
        }
        catch (UnsupportedEncodingException ex) {
            System.out.println("Кодировка не верна." +
                    ex.getMessage());
            return false;
        }
        catch (IOException ex) {
            System.out.println("Ошибка при копировании.");
            return false;
        }
        return true;
    }
}
