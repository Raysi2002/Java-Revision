The Optional class in Java, introduced in Java 8, is a container object used to represent the presence or absence of a value. It helps to avoid NullPointerException by providing methods to deal with null values explicitly.

Why Use Optional?
1.	Avoid Null Checks: Instead of checking for null values, Optional provides methods to deal with absence explicitly.
2.	Better Code Readability: It makes it clear when a value might be absent.
3.	Encourages Functional Programming: It works well with lambda expressions and streams.

Creating an Optional Object

1. Empty Optional

Optional<String> emptyOpt = Optional.empty();

2. Optional with Non-Null Value

Optional<String> nonEmptyOpt = Optional.of("Hello");

	•	Throws NullPointerException if the value is null.

3. Optional with Nullable Value

Optional<String> nullableOpt = Optional.ofNullable(null);

	•	Can handle both null and non-null values.

Most Commonly Used Methods

1. isPresent()
   •	Checks if a value is present.

if (optional.isPresent()) {
System.out.println("Value: " + optional.get());
}

2. isEmpty() (Added in Java 11)
   •	Checks if the Optional is empty.

if (optional.isEmpty()) {
System.out.println("Optional is empty.");
}

3. get()
   •	Retrieves the value if present, otherwise throws NoSuchElementException.

String value = optional.get();

4. orElse(T other)
   •	Returns the value if present; otherwise, returns the specified default value.

String value = optional.orElse("Default Value");

5. orElseGet(Supplier<? extends T> supplier)
   •	Returns the value if present; otherwise, invokes the supplier function.

String value = optional.orElseGet(() -> "Generated Default Value");

6. orElseThrow(Supplier<? extends X> exceptionSupplier)
   •	Returns the value if present; otherwise, throws an exception.

String value = optional.orElseThrow(() -> new IllegalArgumentException("No value present"));

7. ifPresent(Consumer<? super T> action)
   •	Executes the specified action if the value is present.

optional.ifPresent(value -> System.out.println("Value: " + value));

8. ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction) (Added in Java 9)
   •	Executes an action if the value is present; otherwise, runs the empty action.

optional.ifPresentOrElse(
value -> System.out.println("Value: " + value),
() -> System.out.println("Value is absent")
);

9. map(Function<? super T, ? extends U> mapper)
   •	Transforms the value if present.

Optional<Integer> lengthOpt = optional.map(String::length);

10. flatMap(Function<? super T, Optional> mapper)
    •	Similar to map, but avoids nested Optional.

Optional<Integer> lengthOpt = optional.flatMap(value -> Optional.of(value.length()));

11. filter(Predicate<? super T> predicate)
    •	Returns an Optional describing the value if it matches the predicate.

Optional<String> filteredOpt = optional.filter(value -> value.startsWith("H"));

12. stream() (Added in Java 9)
    •	Converts the Optional into a Stream.

optional.stream().forEach(System.out::println);

Best Practices
1.	Avoid Using get() Directly:
•	Always use methods like orElse, orElseGet, or ifPresent to handle values safely.
2.	Do Not Use Optional as a Field or Parameter:
•	Use it as a return type only for methods to indicate optionality.
3.	Avoid Creating Null Optional:
•	Never use Optional.of(null); use Optional.ofNullable() instead.

Example Usage

import java.util.Optional;

public class OptionalExample {
public static void main(String[] args) {
// Creating Optional
Optional<String> optional = Optional.ofNullable("Hello");

        // Check presence
        optional.ifPresent(value -> System.out.println("Value: " + value));

        // Default value
        String result = optional.orElse("Default");
        System.out.println("Result: " + result);

        // Transforming value
        optional.map(String::length).ifPresent(len -> System.out.println("Length: " + len));

        // Filtering value
        optional.filter(value -> value.startsWith("H"))
                .ifPresent(value -> System.out.println("Filtered Value: " + value));
    }
}

This example demonstrates the versatility and power of the Optional class in avoiding null-related issues.