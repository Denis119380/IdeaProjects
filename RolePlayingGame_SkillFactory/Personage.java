abstract class Personage implements Fight{
    private String name;
    private int health, agility, force, skill;
    private int coin;

    Personage(String name, int health, int agility,
              int force, int skill, int coin) {
        this.name = name;
        this.health = health;
        this.agility = agility;
        this.force = force;
        this.skill = skill;
        this.coin = coin;
    }

    Personage() {}

    int randomValue() {
        return (int) (Math.random() * 100);
    }

    @Override
    public int attack() {
        int damage;
        if ( (getAgility() * 3) > randomValue()) {
            damage = getForce();
            if (20 >= randomValue()) { // здесь реализована логика критического удара
                damage = damage * 2;
                System.out.println("Super hit!");
            }
        }
        else damage = 0;
        return damage;
    }

    String getName() {
        return name;
    }

    int getHealth() {
        return health;
    }
    void setHealth(int health) {
        this.health = health;
    }

    int getAgility() {
        return agility;
    }

    int getForce() {
        return force;
    }
    void setForce(int force) {
        this.force = force;
    }

    int getSkill() {
        return skill;
    }
    void setSkill(int skill) {
        this.skill = skill;
    }

    int getCoin() {
        return coin;
    }
    void setCoin(int coin) {
        this.coin = coin;
    }
}
