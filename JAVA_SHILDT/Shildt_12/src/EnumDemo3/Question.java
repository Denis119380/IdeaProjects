package EnumDemo3;

import java.util.Random;

class Question {
    Random rand = new Random();
    Answers ask() {
        int prob = (int) (100 * rand.nextDouble());

        if (prob < 25)
            return Answers.NO; // 25%
        else if (prob < 50)
            return Answers.YES; // 25%
        else if (prob < 70)
            return Answers.MAYBE; // 20%
        else if (prob < 86)
            return Answers.LATER; // 16%
        else if (prob < 98)
            return Answers.SOON; // 12%
        else
            return Answers.NEVER; // 2%
    }
}
