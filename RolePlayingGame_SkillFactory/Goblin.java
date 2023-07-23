public class Goblin extends Personage{
    final private String name;
    final private int agility, force, skill, coin;
    private int health;

    Goblin() {
        this.name = "Goblin";
        this.health = 60;
        this.agility = 20;
        this.force = 10;
        this.skill = 10;
        this.coin = 3;
        System.out.println("I am Goblin! Ha-Ha-Ha!");
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    int getHealth() {
        return health;
    }
    @Override
    void setHealth(int health) {
        this.health = health;
    }

    @Override
    int getAgility() {
        return agility;
    }

    @Override
    int getForce() {
        return force;
    }

    @Override
    int getSkill() {
        return skill;
    }

    @Override
    int getCoin() {return coin; }

}
