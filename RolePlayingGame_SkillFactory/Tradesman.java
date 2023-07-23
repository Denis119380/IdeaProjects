public class Tradesman extends Personage{
    final private String name;
    final private int health;
    private int coin;
    final private static int price = 5;
    final String POTION = "Open";
    Tradesman() {
        this.name = "Boga";
        this.health = 20;
        this.coin = 100;
        System.out.println("Hello! My name is Boga. I am tradesman.");
    }

    public String tradeAndBreak(String str) {
        if (str.equals(POTION)) return "Welcome! Here the Best Potion Health for You!";
        return "Sorry, market to closed.";
    }

    public void trade(Personage hero) { // метод продажи 20 порций здоровья за 5 монет, если они есть
        if (hero.getCoin() >= price) {
            hero.setCoin(hero.getCoin() - price);
            this.coin += price;
            System.out.println("Hero has " + hero.getCoin() + " coin left.");
            hero.setHealth(hero.getHealth() + price * 4);
            System.out.println("Hero has " + hero.getHealth() + " health.");
            System.out.println("Come again! Pleasure doing business with you!");
        }
        else System.out.println("Sorry, you have coins not enough.");
    }

    @Override
    String getName() {
        return this.name;
    }

    @Override
    int getHealth() {
        return this.health;
    }

    @Override
    int getCoin() {
        return this.coin;
    }
}
