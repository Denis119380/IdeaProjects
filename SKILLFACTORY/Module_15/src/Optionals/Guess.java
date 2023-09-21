package Optionals;

import java.util.Optional;
import java.util.Random;

class Guess {

    public static Optional<String> guessNumber(int val) {

        if (val < 1 || val > 5) throw new IllegalStateException();
        else {
            int random = new Random().nextInt(5) + 1;
            System.out.println(random);

            if (random == val) return Optional.of("Win!");
            else return Optional.empty();
        }
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(0));
    }
}
