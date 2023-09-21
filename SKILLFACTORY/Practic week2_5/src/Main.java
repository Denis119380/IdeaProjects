public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Vlad", 23, "teacher", "History");

        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getProfession());
        System.out.println(teacher.getSubject());
        System.out.println(teacher.giveALesson());

    }
}