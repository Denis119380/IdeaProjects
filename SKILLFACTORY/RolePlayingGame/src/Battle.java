class Battle {
    public void fight(Personage hero,
                      Personage monster,
                      FightCallback fightCallback) {
        Runnable runnable = () -> {
            int turn = 1;
            boolean isFightEnded = false;
            while (!isFightEnded) {
                System.out.println("---Turn: " + turn + " ---");
                if (turn++ % 2 != 0)
                    isFightEnded = makeHit(monster, hero, fightCallback);
                else isFightEnded = makeHit(hero, monster, fightCallback);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }

    private boolean makeHit(Personage defender,
                            Personage attacker,
                            FightCallback fightCallback) {
        int hit = attacker.attack();
        int defenderHealth = defender.getHealth() - hit;
        if (defenderHealth < 0) defenderHealth = 0;

        if (hit != 0) {
            System.out.println(attacker.getName() + " to hit with " +
                               hit + " unit.");
            System.out.println(defender.getName() + " has " +
                               defenderHealth + " health units left.");
        } else System.out.println(attacker.getName() + " missed!");

        if (defenderHealth < 1 && defender instanceof Hero) {
            System.out.println(defender.getName() + " fell in battle!");
            fightCallback.fightLost();
            return true;
        } else if (defenderHealth < 1) {
            System.out.println(defender.getName() + " defeated! " +
                    "You get (skill / coin): " +
                    defender.getSkill() + " / " + defender.getCoin());
            attacker.setSkill(attacker.getSkill() + defender.getSkill());
            attacker.setCoin(attacker.getCoin() + defender.getCoin());
            fightCallback.fightWin();
            return true;
        } else {
            defender.setHealth(defenderHealth);
            return false;
        }
    }
}
