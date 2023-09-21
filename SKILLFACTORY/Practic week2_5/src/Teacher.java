public class Teacher extends People {

    String subject;

    public Teacher(String name, int age, String profession, String subject) {
        super(name, age, profession);
        this.subject = subject;
    }
    @Override
    String getProfession() {
        return profession;
    }
    @Override
    int getAge() {
        return super.getAge();
    }
    @Override
    String getName() {
        return name;
    }

    String getSubject() {
        return this.subject;
    }

    String giveALesson() {
        return "The lesson was ended";
    }
}