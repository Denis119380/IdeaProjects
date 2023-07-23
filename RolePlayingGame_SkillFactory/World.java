import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class World {
    private static BufferedReader br;
    private static Personage hero = null;
    private static Battle battle = null;
    private static Tradesman trader = null; // объект - торговец
    private static int pointLevel = 50; // переменная для учёта повышения уровня героя
    public static void main(String[] args) {
        br = new BufferedReader(new InputStreamReader(System.in));
        battle = new Battle();

        System.out.println("What will be hero's name:");
        try {
            command(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void command(String string) throws IOException {
        if (hero == null) {
            hero = new Hero(string,
                    100, 25, 15, 10, 5);
            System.out.println("Here is our new hero with name " +
                    hero.getName());
            printNavigation();
        }
        switch (string) {
            case "1": { // предложение купить за 5 монет 20 порций здоровья
                if (trader == null) trader = new Tradesman();
                System.out.println(trader.tradeAndBreak("Open"));
                System.out.println("If you buy 20 potion health for 5 coins, enter - Portion.");
                command(br.readLine());
            }
                break;
            case "2": {
                commitFight();
            }
                break;
            case "3":
                System.exit(1);
                break;
            case "Yes":
                command("2");
                break;
            case "No": {
                printNavigation();
                command(br.readLine());
            }
                break;
            case "Portion": { // если выбираем этот вариант, то реализуется метод торговца в отношении героя
                trader.trade(hero);
                printNavigation();
                command(br.readLine());
            }
        }
        command(br.readLine());
    }

    private static void printNavigation() {
        System.out.println("Where shall you go?");
        System.out.println("1. To Tradesman");
        System.out.println("2. To dark woods");
        System.out.println("3. Exit");
    }

    private static void commitFight() {
        battle.fight(hero, createMonster(), new FightCallback()
        {
         @Override
         public void fightWin() {

             System.out.println(hero.getName() + " have skill and coin: "
             + hero.getSkill() + " and " + hero.getCoin());
             System.out.println(hero.getName() + " have health: "
             + hero.getHealth());

             if (hero.getSkill() >= pointLevel) { // если skill героя достигнет 50, то force увеличится на 5
                 System.out.println(hero.getName() + " gets new Level!");
                 pointLevel += 50; // создаём следующую ступень уровня героя
                 hero.setForce(hero.getForce() + 5);
                 System.out.println(hero.getName() + " have force " + hero.getForce());
             }

             System.out.println("Would you like to continue adventure or return to safety?" +
                     " (Yes/No)");
             try {
                 command(br.readLine());
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }

         @Override
         public void fightLost() {
             System.exit(1);
         }
        });
    }

    private static Personage createMonster() {
        int random = (int) (Math.random() * 10);
        if (random > 4) return new Skeleton(
                "Skeleton",
                50, 15, 5, 5, 2);
        else return new Goblin();
    }
}
