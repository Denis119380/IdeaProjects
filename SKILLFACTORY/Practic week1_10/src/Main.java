public class Main {
    public static void main(String[] args) {
        Mage wiz = new Mage("Alex", 20, 23, "fire");
        Mage mage = new Mage("Zorro", 20, 23, "fire");
        System.out.println(wiz.getInfo());
        System.out.println(wiz.fight(mage));
    }
}