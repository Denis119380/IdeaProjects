import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("C:\\Users\\HP\\IdeaProjects\\SKILLFACTORY\\TestClassFile", "TestClassFile.txt");
        // первый способ создания объекта с файлом, работа в рамках системы поэтому "\\"

        File file2 = new File("src/Main.java");
        // второй способ, работа в рамках проекта поэтому "/"

        File directory = new File("C:\\Users\\HP\\IdeaProjects\\SKILLFACTORY\\TestClassFile");
        File file3 = new File(directory, "TestClassFile.txt");
        System.out.println(file3.getName()); // метод возвращает имя файла или каталога
        // третий способ

        System.out.println(file1.getAbsolutePath()); // метод предоставляет абсолютный путь файла

        System.out.println(file1.canRead()); // метод указывает доступен ли файл для чтения
        System.out.println(file1.canWrite()); // метод указывает доступен ли файл для записи

        System.out.println(file2.exists()); // метод указывает существует ли файл на диске

        System.out.println(file3.getParent()); // метод возвращает имя каталога в котором находится файл
        System.out.println(file3.getPath()); // метод возвращает путь к файлу/каталогу
        System.out.println();

        System.out.println(file1.lastModified()); // метод возвращает дату последнего изменения в милисекундах
        System.out.println(file1.isFile()); // метод проверяет является ли обект файлом
        System.out.println(directory.isDirectory()); // метод проверяет является ли объект каталогом
        System.out.println();

        File file4 = new File("C:\\Users\\HP\\IdeaProjects\\SKILLFACTORY\\TestClassFile\\TestDirectory");
        boolean isCreated = file4.mkdir(); // метод создаёт новую директорию по адресу указанному в конструкторе
        System.out.println(isCreated);
        boolean isDeleted = file4.delete(); // метод удаляет каталог, возвращает логическое true
        System.out.println(isDeleted);

        long length1 = file2.length(); // метод дающий размер файла в байтах
        double length2 = directory.length();
        System.out.println(length1);
        System.out.println(length2/1048576 + " Мегабайт");

//        File file5 = new File("C:\\Users\\HP\\IdeaProjects\\SKILLFACTORY\\TestClassFile\\Test.txt");
//        boolean isCreatedFile = file5.createNewFile(); // метод создаёт новый файл, но надо обработать исключение
//        System.out.println(isCreatedFile);

        String[] files = directory.list(); // метод создаёт массив с именами файлов находящихся в директории
        System.out.println(Arrays.toString(files));

    }
}