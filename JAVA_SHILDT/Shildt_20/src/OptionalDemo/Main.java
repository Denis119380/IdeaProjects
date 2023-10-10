package OptionalDemo;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();
        Optional<String> hasVal = Optional.of("Alphabet");

        if (noVal.isPresent()) {
            System.out.println("No writing.");
        } else System.out.println("Empty value.");

        if (hasVal.isPresent()) {
            System.out.println("Next value: " + hasVal.get());
        }

        String string = noVal.orElse("Default value.");
        System.out.println(string);
    }
}
