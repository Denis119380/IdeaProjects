import java.io.*;

public class Copy {


    private static void copyFileUsingStream(String source, String dest) throws IOException {
        // метод копирует указанный файл

        InputStream fis = new FileInputStream(source); // создание экземпляра считываемого файла
        OutputStream fos = new FileOutputStream(dest); // создание экземпляра записываемого файла

        byte[] buffer = new byte[1024]; // массив используемый для считывания-записи
        int length;

        while ((length = fis.read(buffer)) > 0) { // блоковые методы read() и write(), позволяют
                                                  // считывать-записывать целый массив байтов
            fos.write(buffer, 0, length);
        }
        fis.close();
        fos.close();
    }

    public static void main(String[] args) throws IOException{

        Copy copy = new Copy();

        copy.copyFileUsingStream("paint.png", "paintCopy.png");
        // файл считывания должен находиться в директории проекта
        // файл записи (копия) будет находиться в директории проекта
    }
}
