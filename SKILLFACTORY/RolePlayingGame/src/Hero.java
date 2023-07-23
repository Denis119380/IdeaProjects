class Hero extends Personage {

    Hero(String name, int health, int agility,
         int force, int skill, int coin) {
        super(name, health, agility, force, skill, coin);
        System.out.println("I am The Best Hero!!!");
    }
}
