import java.util.Random;
// в классе Random создаются псевдослучайные числа
class Question implements SharedConstants{

    Random rand = new Random();
    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        // метод nextDouble() возвращает случайные числа
        // в пределах от 0.0 до 1.0
        if (prob < 30)
            return NO; // 30%
        else if (prob < 60)
            return YES; // 30%
        else if (prob < 75)
            return LATER; // 15%
        else if (prob < 98)
            return SOON; // 13%
        else
            return NEVER; // 2%
    }
}
