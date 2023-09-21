abstract public class People {

    String name;
    private int age;
    String profession;

    public People (String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    abstract String getName();

    int getAge() {
        return this.age;
    }

    abstract String getProfession();
}