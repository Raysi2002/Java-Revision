package optionalclass;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        Optional<String> nullable = Optional.ofNullable("someString");
        Optional<String> present = Optional.of("defaultValue");
        System.out.println(present.get().toUpperCase());
        System.out.println(nullable.get().toLowerCase());


    }
}
