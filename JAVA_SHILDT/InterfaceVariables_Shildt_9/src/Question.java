import java.util.Random;
// в классе Random создаются псевдослучайные числа
class Question implements SharedConstants{

    Random rand = new Random();
    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        // метод nextDouble() возвращает случайные числа
        // в пределах от 0.0 до 1.0
        if (prob < 25)
            return NO; // 25%
        else if (prob < 50)
            return YES; // 25%
        else if (prob < 70)
            return MAYBE; // 20%
        else if (prob < 86)
            return LATER; // 16%
        else if (prob < 98)
            return SOON; // 12%
        else
            return NEVER; // 2%
    }
}
