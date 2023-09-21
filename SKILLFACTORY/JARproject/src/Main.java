import java.io.File;

public class Main {
    public static void main(String[] args) {

        File folder = new File("JAR-project/");
        System.out.println(folder.getName());

        File folderSub = new File("C:\\Users\\HP\\IdeaProjects\\SKILLFACTORY\\TestClassFile\\folderSub");
        boolean isCreated = folderSub.mkdir();
        System.out.println(isCreated);
    }
}